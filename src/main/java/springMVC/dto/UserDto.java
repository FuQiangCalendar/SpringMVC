package springMVC.dto;

public class UserDto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.id
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.user_name
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.password
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.age
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.id
     *
     * @return the value of user_t.id
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.id
     *
     * @param id the value for user_t.id
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.user_name
     *
     * @return the value of user_t.user_name
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.user_name
     *
     * @param userName the value for user_t.user_name
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.password
     *
     * @return the value of user_t.password
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.password
     *
     * @param password the value for user_t.password
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.age
     *
     * @return the value of user_t.age
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.age
     *
     * @param age the value for user_t.age
     *
     * @mbggenerated Wed Sep 04 11:01:58 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}