package org.dota2school.mlm.wx.controller;

import org.dota2school.mlm.common.model.Entry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mlm/wx/user")
public class MlmWxUserController {


    /**
     * 增加一个用户
     * @param iv 加密算法的初始向量
     * @param code 服务器用来获取sessionKey的必要参数
     * @param encryptedData 加密过的字符串
     * @return 增加用户的结果
     * 返回:
     *     1.session: 用户的openid
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Entry addUser(
            String iv,
            String code,
            String encryptedData){

        return null;
    }

    /**
     * 用户登录
     * @param iv 加密算法的初始向量
     * @param code 服务器用来获取sessionKey的必要参数
     * @param encryptedData 加密过的字符串
     * @return 登录的结果
     *  返回:
     *      1.session: 用户的openid
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Entry login(String iv,String code,String encryptedData)throws Exception{
        return null;
    }

    /**
     * 绑定用户的身份
     * @param session 用户的id
     * @param roleType 用户是老师还是学生
     * @param nickName 用户的昵称
     * @param classType 用户的班级类型
     * @param steamID 用户的steamId
     * @param rankScore 用户的天梯扥
     * @param contents 其他内容
     * @param className 用户的班级名称
     * @return 绑定的结果
     *  返回:
     *      1
     */
    @RequestMapping(value = "/bind",method = RequestMethod.POST)
    public Entry bind(
            String session,
            String roleType,
            String nickName,
            String classType,
            String steamID,
            String rankScore,
            String contents,
            String className){
        return null;
    }

    /**
     * 修改用户信息
     * @param session
     * @param roleType
     * @param nickName
     * @param classType
     * @param steamID
     * @param rankScore
     * @param contents
     * @param className
     * @return
     */
    @RequestMapping(value = "/modify",method = RequestMethod.POST)
    public Entry modify(String session,
                        String roleType,
                        String nickName,
                        String classType,
                        String steamID,
                        String rankScore,
                        String contents,
                        String className){
                return null;
    }


}
