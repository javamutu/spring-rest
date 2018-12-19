package com.mutu.spring.rest.zgen.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.mutu.spring.rest.zgen.entity.Roles;
import com.mutu.spring.rest.zgen.entity.RolesExample;

public interface RolesMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int countByExample(RolesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int deleteByExample(RolesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Long roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int insert(Roles record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int insertSelective(Roles record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	List<Roles> selectByExampleWithRowbounds(RolesExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	List<Roles> selectByExample(RolesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	Roles selectByPrimaryKey(Long roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Roles record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table ROLES
	 *
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Roles record);
}