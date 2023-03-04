package com.lcc.structure.facadepatterns;

/**
 * @author Licc
 * @date 2023/3/4 4:29 PM
 * 实战外观者模式：使用设计模式设计黑白名单
 * 解决痛点：
 *    是降低调用方的使用接口的复杂逻辑组合。这样调用方与实际的接口提供方提供了一个中间层，用于包装逻辑提供API接口。
 *    有些时候外观模式也被用在中间件层，对服务中的通用性复杂逻辑进行中间件层包装，让使用方可以只关心业务开发。
 * 同一案列：
 *      那么这样的模式在我们的所见产品功能中也经常遇到，就像几年前我们注册一个网站时候往往要添加很多信息，包括；姓名、
 *      昵称、手机号、QQ、邮箱、住址、单身等等，但现在注册成为一个网站的用户只需要一步即可，无论是手机号还是微信也都
 *      提供了这样的登录服务。而对于服务端应用开发来说以前是提供了一个整套的接口，现在注册的时候并没有这些信息，
 *      那么服务端就需要进行接口包装，在前端调用注册的时候服务端获取相应的用户信息(从各个渠道)，
 *      如果获取不到会让用户后续进行补全(营销补全信息给奖励)，以此来拉动用户的注册量和活跃度
 */
public class FacadepatternsMain {
}