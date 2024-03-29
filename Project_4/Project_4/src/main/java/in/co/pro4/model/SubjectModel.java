package in.co.pro4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import in.co.pro4.bean.CourseBean;
import in.co.pro4.bean.SubjectBean;
import in.co.pro4.exception.ApplicationException;
import in.co.pro4.exception.DatabaseException;
import in.co.pro4.exception.DuplicateRecordException;
import in.co.pro4.utility.JDBCDataSource;

/**
 * JDBC implementation of SubjectModel
 * 
 * @author  Ashish Kushwah
 *
 */
public class SubjectModel {
	private static Logger log = Logger.getLogger(SubjectModel.class);

	/**
	 * 
	 * Used to find record in database by non bussiness primary key
	 */
	private Integer nextPK() throws DatabaseException {
		log.debug("Model nextpk Started");
		Connection conn = null;
		int pk = 0;
		try {

			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT MAX(ID) FROM ST_SUBJECT");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		} catch (Exception e) {
			log.error("Database Exception..", e);
			throw new DatabaseException("Exception : Exception in getting pk");

		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model next pk End");
		return pk = pk + 1;
	}

	/**
	 * 
	 * Used to add record in database
	 */
	public long add(SubjectBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;

		CourseModel cModel = new CourseModel();
		CourseBean CourseBean = cModel.FindByPK(bean.getCourseId());
		bean.setCourseName(CourseBean.getName());

		SubjectBean duplicateName = findByName(bean.getCourseName());
		int pk = 0;

		if (duplicateName != null) {
			throw new DuplicateRecordException("Subject Name already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("INSERT  ST_SUBJECT VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getSubjectName());
			pstmt.setString(3, bean.getDescription());
			pstmt.setLong(4, bean.getCourseId());
			pstmt.setString(5, bean.getCourseName());
			pstmt.setString(6, bean.getCreatedBy());
			pstmt.setString(7, bean.getModifiedBy());
			pstmt.setTimestamp(8, bean.getCreatedDatetime());
			pstmt.setTimestamp(9, bean.getCreatedDatetime());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			log.error("Database Exception....", e);
			try {
				conn.rollback();
			} catch (Exception ex) {
				// ex.printStackTrace();
				throw new ApplicationException("Excetion : add rollback Exception " + ex.getMessage());
			}

		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	/**
	 * 
	 * Used to delete record in database
	 */
	public void Delete(SubjectBean bean) throws ApplicationException {
		log.debug("Model Delete Started");
		Connection conn = null;
		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("DELETE  FROM ST_SUBJECT WHERE ID=?");
			pstmt.setLong(1, bean.getId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (Exception e) {
			log.error("Database Exception....", e);
			try {
				conn.rollback();
			} catch (Exception ex) {
				throw new ApplicationException("Exception : Delete rollback Wxception " + ex.getMessage());
			}
			throw new ApplicationException("Exception in delete subjecte");

		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model delete End");

	}

	/**
	 * 
	 * Used to update record in database
	 */
	public void update(SubjectBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("model update Started");
		Connection conn = null;

		CourseModel cModel = new CourseModel();
		CourseBean CourseBean = cModel.FindByPK(bean.getCourseId());
		bean.setCourseName(CourseBean.getName());

		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE ST_SUBJECT SET SUBJECT_NAME=?, DESCRIPTION=?, COURSE_ID=?, COURSE_NAME=?, CREATED_BY=?, MODIFIED_BY=?, CREATED_DATETIME=?, MODIFIED_DATETIME=? WHERE ID=?");

			pstmt.setString(1, bean.getSubjectName());
			pstmt.setString(2, bean.getDescription());
			pstmt.setLong(3, bean.getCourseId());
			pstmt.setString(4, bean.getCourseName());
			pstmt.setString(5, bean.getCreatedBy());
			pstmt.setString(6, bean.getModifiedBy());
			pstmt.setTimestamp(7, bean.getCreatedDatetime());
			pstmt.setTimestamp(8, bean.getModifiedDatetime());
			pstmt.setLong(9, bean.getId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (Exception e) {
			// e.printStackTrace();
			log.error("Database Exception.....", e);
			try {
				conn.rollback();
			} catch (Exception ex) {
				throw new ApplicationException("Exception : update rollback Exception " + ex.getMessage());
			}
			throw new ApplicationException("Exception :Exception in update subject");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model upodate End");

	}

	/**
	 * 
	 * Used to find record in database by name
	 */
	public SubjectBean findByName(String name) throws ApplicationException {
		log.debug("Model findByName Started");
		StringBuffer sql = new StringBuffer("SELECT * FROM ST_SUBJECT WHERE SUBJECT_NAME=?");
		SubjectBean bean = null;
		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			// System.out.println(name + "jhdsfuhf");
			ResultSet rs = pstmt.executeQuery();
			// System.out.println("query working");
			while (rs.next()) {
				bean = new SubjectBean();
				bean.setId(1);
				bean.setSubjectName(rs.getString(2));
				bean.setDescription(rs.getString(3));
				bean.setCourseId(rs.getLong(4));
				bean.setCourseName(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));
			}
			rs.close();
		} catch (Exception e) {
			log.error("Database Exception...", e);
			throw new ApplicationException("Exception in getting subject by name");
		} finally {
			JDBCDataSource.closeConnection(conn);
			log.debug("Model findByName End");
		}
		return bean;

	}

	/**
	 * 
	 * Used to find record in database by primary key
	 */
	public SubjectBean FindByPK(long pk) throws ApplicationException {
		log.debug("Model FindByPK Started");
		StringBuffer sql = new StringBuffer("SELECT * FROM ST_SUBJECT WHERE ID=?");
		Connection conn = null;
		SubjectBean bean = null;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setLong(1, pk);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				bean = new SubjectBean();
				bean.setId(1);
				bean.setSubjectName(rs.getString(2));
				bean.setDescription(rs.getString(3));
				bean.setCourseId(rs.getLong(4));
				bean.setCourseName(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));
			}
			rs.close();

		} catch (Exception e) {
			log.error("Database Exception...", e);
			throw new ApplicationException("Exception in getting subject by pk");
		} finally {
			JDBCDataSource.closeConnection(conn);

		}
		log.debug("Model FindbyPK End");
		return bean;
	}

	public List search(SubjectBean bean) throws DatabaseException, ApplicationException {
		return search(bean, 0, 0);
	}

	/**
	 * 
	 * Used to search record in database
	 */
	public List search(SubjectBean bean, int pageNo, int pageSize) throws DatabaseException, ApplicationException {
		log.debug("Model search Started");
		StringBuffer sql = new StringBuffer("SELECT * FROM ST_SUBJECT WHERE true");
		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND ID = " + bean.getId());
				// System.out.println("NOT null");
			}
			if (bean.getSubjectName() != null && bean.getSubjectName().length() > 0) {
				sql.append(" AND SUBJECT_NAME LIKE '" + bean.getSubjectName() + "%'");
			}

			if (bean.getDescription() != null && bean.getDescription().length() > 0) {
				sql.append(" AND DESCRIPTION LIKE '" + bean.getDescription() + "%'");
			}
			if (bean.getCourseId() > 0) {
				sql.append(" AND COURSE_ID = " + bean.getCourseId());
			}
			if (bean.getCourseName() != null && bean.getCourseName().length() > 0) {
				sql.append(" AND COURSE_NAME LIKE '" + bean.getCourseName() + "%'");
			}

		}
		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" LIMIT " + pageNo + "," + pageSize);
		}

		ArrayList list = new ArrayList();
		Connection conn = null;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			System.out.println(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				bean = new SubjectBean();
				bean.setId(rs.getLong(1));
				bean.setSubjectName(rs.getString(2));
				bean.setDescription(rs.getString(3));
				bean.setCourseId(rs.getLong(4));
				bean.setCourseName(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));
				list.add(bean);
			}
			rs.close();
		} catch (Exception e) {
			log.error("Database Exception...", e);
			throw new ApplicationException("Exception in the search" + e.getMessage());
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("MOdel search End");
		return list;
	}

	public List list() throws Exception {
		return list(0, 0);
	}

	/**
	 * 
	 * Used to get record list from database
	 */
	public List list(int pageNo, int pageSize) throws Exception {

		log.debug("model list started");

		List list = new ArrayList();

		StringBuffer sql = new StringBuffer("SELECT * FROM ST_SUBJECT");

		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" LIMIT " + pageNo + " ," + pageSize);
		}

		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			ResultSet rs = pstmt.executeQuery();
			SubjectBean bean;
			while (rs.next()) {
				bean = new SubjectBean();

				bean.setId(rs.getLong(1));
				bean.setSubjectName(rs.getString(2));
				bean.setDescription(rs.getString(3));
				bean.setCourseId(rs.getLong(4));
				bean.setCourseName(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));

				list.add(bean);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Database Exception...", e);
			throw new ApplicationException("Exception : Exception in getting list " + e.getMessage());

		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model List Ended");
		return list;
	}
}
