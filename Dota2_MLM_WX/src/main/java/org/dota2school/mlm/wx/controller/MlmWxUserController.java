package org.dota2school.mlm.wx.controller;

import org.dota2school.mlm.wx.annotation.MLMAop;
import org.dota2school.mlm.wx.annotation.Tested;
import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.service.MlmWxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * 用户相关的操作的controller
 * @author Xuxue1 2017-11-26
 */
@RestController
@RequestMapping("/api/mlm/wx/user")
public class MlmWxUserController {

    @Autowired
    private MlmWxUserService userService;

    /**
     * 增加一个用户 如果用户已经存在 则更新用户的 信息
     * @param iv 加密算法的初始向量
     * @param code 服务器用来获取sessionKey的必要参数
     * @param encryptedData 加密过的字符串
     * @return 增加用户的结果
     * 返回:
     *     1.session: 用户的openid
     */
    @MLMAop("")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Entry addUser(
            String iv,
            String code,
            String encryptedData){
        return userService.addUser(iv,code,encryptedData);
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
    @MLMAop("")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Entry query(String iv,String code,String encryptedData)throws Exception{
        return userService.query(iv,code,encryptedData);
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
     *      1.success               bool    请求是否成功
     *      2.errorCode             int     错误码
     *      3.errorMessage          string  错误信息
     *      4.userInfo.nickName     string  用户的昵称
     *      5.userInfo.roleType     string  用户的类型       1代表学生 2代表老师
     *      6.userInfo.classType    string  班级类型        萌新班 提高班
     *      7.userInfo.steamID      string  用户的steamID
     *      8.userInfo.rankScore    string  用户的天梯分
     *      9.userInfo.contents     string  内容
     *      10.userInfo.avatarUrl   string  用户头像地址
     *      11.userInfo.userName    string  用户名
     *      12.userInfo.className   string  班级名
     *
     */
    @Tested
    @MLMAop("")
    @RequestMapping(value = "/modify",method = RequestMethod.POST)
    public Entry modify(
            String session,
            String roleType,
            String nickName,
            String classType,
            String steamID,
            String rankScore,
            String contents,
            String className){
        return userService.modify(
                session,
                roleType,
                nickName,
                classType,
                steamID,
                rankScore,
                contents,
                className);
    }

    /**
     * 查询用户
     * @param session 用户的id
     * @return 绑定的结果
     *  返回:
     *      1.success               bool    请求是否成功
     *      2.errorCode             int     错误码
     *      3.errorMessage          string  错误信息
     *      4.userInfo.nickName     string  用户的昵称
     *      5.userInfo.roleType     string  用户的类型       1代表学生 2代表老师
     *      6.userInfo.classType    string  班级类型        萌新班 提高班
     *      7.userInfo.steamID      string  用户的steamID
     *      8.userInfo.rankScore    string  用户的天梯分
     *      9.userInfo.contents     string  内容
     *      10.userInfo.avatarUrl   string  用户头像地址
     *      11.userInfo.userName    string  用户名
     *      12.userInfo.className   string  班级名
     *
     */
    @Tested
    @MLMAop("")
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public Entry query(String session){
                return userService.query(session);
    }

}
