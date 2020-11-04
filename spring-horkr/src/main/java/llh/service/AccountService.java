package llh.service;/**
 * Created by Administrator on 2018/8/28.
 */

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Tommy
 *         Created by Tommy on 2018/8/28
 **/
public interface AccountService {
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	void addAccount(String name, int initMenoy);

    List<Account> queryAccount(String name);

    int updateAccount(String name, int money);
}
