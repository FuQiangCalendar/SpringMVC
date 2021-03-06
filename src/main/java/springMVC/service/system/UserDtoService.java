package springMVC.service.system;

import springMVC.dto.UserDto;
import springMVC.tools.exception.ServiceException;
import springMVC.tools.result.Result;

public interface UserDtoService {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    Result deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    Result insert(UserDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    Result insertSelective(UserDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    Result selectByPrimaryKey(Integer id);
    
    Result selectByUser (String user) throws Exception;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    Result updateByPrimaryKeySelective(UserDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    Result updateByPrimaryKey(UserDto record);
}
