package springMVC.service.systemImpl;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springMVC.dto.UserDto;
import springMVC.mapper.UserDtoMapper;
import springMVC.service.system.UserDtoService;
import springMVC.tools.enums.TableOprateEnum;
import springMVC.tools.exception.ServiceException;
import springMVC.tools.result.Result;

@Service
@Transactional
public class UserDtoServiceImpl implements UserDtoService {
	
	@Autowired
	private UserDtoMapper userDtoMapper;
	
	@SuppressWarnings("unchecked")
	@Override
	public Result deleteByPrimaryKey(Integer id) {
		int num = 0;
		try {
			num = userDtoMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(TableOprateEnum.DELETE_FAIL.getCode(), TableOprateEnum.DELETE_FAIL.getMsg());
		}
		
		if (num == 0) {
			return new Result(TableOprateEnum.DELETE_NULL.getCode(), TableOprateEnum.DELETE_NULL.getMsg());
		}
		
		return new Result(TableOprateEnum.DELETE_SUCCESS.getCode(), TableOprateEnum.DELETE_SUCCESS.getMsg(), num);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result insert(UserDto record) {
		int num = userDtoMapper.insert(record);
		
		if (num ==0) {
			return new Result(TableOprateEnum.INSERT_FAIL.getCode(), TableOprateEnum.INSERT_FAIL.getMsg());
		}
			 
		return new Result(TableOprateEnum.INSERT_SUCCESS.getCode(), TableOprateEnum.INSERT_SUCCESS.getMsg(), num);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result insertSelective(UserDto record) {
		int num = userDtoMapper.insertSelective(record);
		
		if (num ==0) {
			return new Result(TableOprateEnum.INSERT_FAIL.getCode(), TableOprateEnum.INSERT_FAIL.getMsg());
		}
			 
		return new Result(TableOprateEnum.INSERT_SUCCESS.getCode(), TableOprateEnum.INSERT_SUCCESS.getMsg(), num);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result selectByPrimaryKey(Integer id) {
		UserDto map = null;
		try {
			map = userDtoMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(TableOprateEnum.SELECT_FAIL.getCode(), TableOprateEnum.SELECT_FAIL.getMsg(), map);
		}
		
		if (Objects.isNull(map)) {
			return new Result(TableOprateEnum.SELECT_NULL.getCode(), TableOprateEnum.SELECT_NULL.getMsg(), map);
		}
		return new Result(TableOprateEnum.SELECT_SUCCESS.getCode(), TableOprateEnum.SELECT_SUCCESS.getMsg(), map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result updateByPrimaryKeySelective(UserDto record) {
		int num = 0;
		try {
			num = userDtoMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(TableOprateEnum.UPDATE_FAIL.getCode(), TableOprateEnum.UPDATE_FAIL.getMsg());
		}
		
		if (num == 0) {
			return new Result(TableOprateEnum.UPDATE_NULL.getCode(), TableOprateEnum.UPDATE_NULL.getMsg(), num);
		}
		
		return new Result(TableOprateEnum.UPDATE_SUCCESS.getCode(), TableOprateEnum.UPDATE_SUCCESS.getMsg(), num);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result updateByPrimaryKey(UserDto record) {
		int num = 0;
		try {
			num = userDtoMapper.updateByPrimaryKey(record);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(TableOprateEnum.UPDATE_FAIL.getCode(), TableOprateEnum.UPDATE_FAIL.getMsg());
		}
		
		if (num == 0) {
			return new Result(TableOprateEnum.UPDATE_NULL.getCode(), TableOprateEnum.UPDATE_NULL.getMsg(), num);
		}
		
		return new Result(TableOprateEnum.UPDATE_SUCCESS.getCode(), TableOprateEnum.UPDATE_SUCCESS.getMsg(), num);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result selectByUser(String user) throws ServiceException {
		boolean success = false;
		List<Map<String, Object>> map = null;
		try {
			map = userDtoMapper.selectByUser(user);
			success = true;
		} catch (Exception e) {
//			e.printStackTrace();
//			return new Result(TableOprateEnum.SELECT_FAIL.getCode(), TableOprateEnum.SELECT_FAIL.getMsg(), map);
//			throw new ServiceException("是不是傻？sql查询出错啦！");
		}
		
		if (!success) {
			throw new ServiceException("是不是傻？sql查询出错啦！");
		}
		
		if (Objects.isNull(map) || map.size() == 0) {
//			return new Result(TableOprateEnum.SELECT_NULL.getCode(), TableOprateEnum.SELECT_NULL.getMsg(), map);
			throw new ServiceException("是不是傻？系统无此用户");
		}
		return new Result(TableOprateEnum.SELECT_SUCCESS.getCode(), TableOprateEnum.SELECT_SUCCESS.getMsg(), map);
	}

}
