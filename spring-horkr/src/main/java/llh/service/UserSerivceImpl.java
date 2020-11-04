package llh.service;/**
 * Created by Administrator on 2018/8/29.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Tommy
 *         Created by Tommy on 2018/8/29
 **/
@Service
public class UserSerivceImpl implements UserSerivce {


    @Autowired
    AccountService accountService;
    @Autowired
    JdbcTemplate jdbcTemplate;



    @Override
    @Transactional
    public void createUser(String name) {
        // 插入user 记录
        jdbcTemplate.update("INSERT INTO `user` (name) VALUES(?)", name);

        // 调用 accountService 添加帐户
        accountService.addAccount(name, 10000);

		// 人为报错
		int a=1;
		if(a==1){
			throw new IllegalStateException("");
		}
    }




}
