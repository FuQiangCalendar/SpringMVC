package springMVC.mapper;

import springMVC.dto.UserDto;

public interface UserDtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    int insert(UserDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    int insertSelective(UserDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    UserDto selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    int updateByPrimaryKeySelective(UserDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    int updateByPrimaryKey(UserDto record);
}