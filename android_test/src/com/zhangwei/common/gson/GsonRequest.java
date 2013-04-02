package com.zhangwei.common.gson;

public class GsonRequest {
	//1.	手机UA协议 
	//HTTP POST http://v.looklook.cn/vs/api/ua
	public static class uaRequest{
		String imei; //"11111112222"
		String imsi; //"460028105401115"
		String resolution; //"480 x 800"
		String channel_number;
		String equipmentid; //"1"
		String basestationinfo;
		String gps;
		String ip;
		String mac;
		String devicetype;
		String systemversionid;
		String internetway;
		String siteid;
		String columnsversion;
		String cdr; //"aaaa,bbbb,dddd,"
		String errorlog; //" aaaa,bbbb,dddd"
		String clientversion; //
	}
	
	//2.	用户注册
	//HTTP POST http://v.looklook.cn/vs/api/user/register
	//requestapp= 
	public static class registerRequest{
		String equipmentid;
		String username;
		String password;
		String nickname; //昵称
		String gps; //”123.00:8733.00”
		String devicetoken; //"asdfasdfhasdkjaslfjasldfkalsfjad"//设备
		String imei;
		String Mobiletype; //1 ios 2 Andriod
		String sex; //0男 1女 2未知
		String address; //北京朝阳”
		String birthdate; //
		String tag; //”心情不错”//可为空
		
	}
	
	//4.	修改用户信息
	//HTTP POST /vs/api/user/changeUserInfo
	//requestapp=
	public static class changeUserInfoRequest{
		String userid;
		String username; //qwert@sample.com",//用户名,在用户名不存在时才会更新，否则返回status＝1,选填。输入为空时，不更新
		String password;
		String nickname; //昵称

		String sex; //0男 1女 2未知
		String birthdate; //
		String address; //北京朝阳”
		String tag; //”心情不错”//可为空
		
	}
	
	//5.	修改水印
	//HTTP POST http://v.looklook.cn/vs/api/user/watermark
	//requestapp=
	public static class watermarkRequest{
		String userid;
		String watermark; //"幸福一刻"//为空时，就是将旧水印更新为空
	}
	
	//6.	用户登录
	//HTTP POST/vs/api/user/login?
	//requestapp=
	public static class loginRequest{
		String username;//"zhangsan",//snstype>0时无这个值
		String password; //"asdf1234",//snstype>0时无这个值
		String snsid; //123456",//snstype=0时无这个值
		String equipmentid;
		String snstype; // ,//0站内登录、1新浪微博、6腾讯微博
		String devicetoken; //asdfasdfhasdkjaslfjasldfkalsfjad"//设备devicetoken，用于收消息，可以为空
		
		//如果snstype>0 以下字段有效
		String nickname; //昵称",//用户昵称
		String gps; //"123.00:8733.00”
		String imei; //"67-0987786543”
		int Mobiletype; //1 ios 2 Andriod
		String sex; //snstype>0时
		String birthdate; //snstype>0时
		String address; //snstype>0时,
		String tag; //"心情不错"//可为空

	}
	
	//9.	获取Socket IP 端口
	//HTTP POST http://v.looklook.cn/vs/api/getSocket
	//requestapp=
	public static class getSocketRequest{
		String userid;
		String filetype; //”.mp4”
	}
	
	//10.	创建视频ID 
	//HTTP POST http://v.looklook.cn/vs/api/getVideoId  
	//requestapp=
	public static class getVideoIdRequest{
		String userid;
		String videopath; //"/…/...mp4” 
		String longitude; //”1111.111”,//经度,可能为空
		String latitude; //”222211.11221”,//纬度，可能为空
		String loc; //"北京市朝阳区朝阳路”//位置，可能为空，base64编码

	}
	
	//11.	分享好友
	//HTTP POST http://v.looklook.cn/vs/api/shareLook?requestapp=
	public static class shareLookRequest{
		String userid;
		String position; //"北京市朝阳区东八里庄公交站",//分享位置，可能为空
		String longitude; //”1111.111”,//经度,可能为空
		String latitude; //”222211.11221”,//纬度，可能为空
		
		String isForward; //如果是转发，isForward=1,缺省是0
		String fromUserId;//视频来源。这个值在视频信息里也有。在isForward=1时生效。
		int videoid; //视频ID 必须不能为空
		String videourl; //http://…./…mpg",//分享短链接 
		String snscontent; //"终于见到演员中的乔丹了”//用户输入的微博信息
		int snstype=0; //0：本地分享 /转发，1：微博分享/转发 （包含本地虚拟第三方形式的分享操作，即：sns集合的snstype=0，此处也设置为1）
		String friendids; //”2,3,4,…”,//好友ID，”,”分开。snstype=0时生效。
		SNS[] sns;
		String tags; //”212,121,213”,
		String active_id; //”132”//活动id
		int location_status;  //0代表隐藏位置信息  1代表显示
	}
	
	//12.	我的视频
	//HTTP POST http://v.looklook.cn/vs/api/listMyVideo?requestapp=
	public static class listMyVideoRequest{
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		String userId; //"11111"  // 当前操作人
		String viewuserid; //”22222”  // 需要显示的视频用户ID
		String videowidth; //”12313”,  // 封面需要显示的宽度，可以为空
		String videoheight; //”22322”  // 封面需要显示的高度，可以为空

	}
	
	//13.	列表好友视频
	//HTTP POST http://v.looklook.cn/vs/api /listFriendVideo?requestapp=
	public static class listFriendVideoRequest{
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		String userId; //"11111"  // 当前操作人
		int categoryid; //11
		String videowidth; //”12313”,  // 封面需要显示的宽度，可以为空
		String videoheight; //”22322”  // 封面需要显示的高度，可以为空

	}
	
	//14.	列表收藏视频
	//HTTP POSThttp://v.looklook.cn/vs/api /listFavoriteVideo?requestapp=
	public static class listFavoriteVideoRequest{
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		String userId; //"11111"  // 当前操作人
		String videowidth; //”12313”,  // 封面需要显示的宽度，可以为空
		String videoheight; //”22322”  // 封面需要显示的高度，可以为空

	}
	
	//15.	收藏视频
	//HTTP POST http://v.looklook.cn/vs/api/favorite/addFavorite
	//requestapp=
	public static class addFavoriteRequest{

		String userId; //"11111"  // 当前操作人
		String videoid; //”22",//收藏的视频ID

	}
	
	//16.	收藏删除
	//HTTP POST http://v.looklook.cn/vs/api/favorite/removeFavorite
	public static class removeFavoriteRequest{

		String userId; //"11111"  // 当前操作人
		VideoItems[] videoids;

	}
	
	//17.	发送统计信息
	//HTTP POST http://v.looklook.cn/vs/api/postLog
	public static class postLogRequest{
		String userId; //"11111"  // 当前操作人
		String log; //”444，444，444，444，” CDR话单字符串
	}
	
	//18.	意见反馈
	//HTTP POST http://v.looklook.cn/vs/api/feedback
	//requestapp=
	public static class feedbackRequest{
		String userId;
		String equipmentid; //”1234”//设备ID  
		String commentcontent; //”这个应用真好玩，帮了我大忙了！！哈哈”
	}
	
	//19.	上传视频点击量提醒
	//HTTP POST http://v.looklook.cn/vs/api/userremind/getUserRemind
	//requestapp=
	public static class getUserRemindRequest{
		String userId;
	}
	
	//20.	绑定微博 
	//HTTP POST http://v.looklook.cn/vs/api/bindWeibo?requestapp=
	public static class bindWeiboRequest{
		String userid;
		int snstype; //微博类型
		String snsId;
	}
	
	//21.	好友列表/推荐列表
	//HTTP POST http://v.looklook.cn/vs/api/listFriend？
	//requestapp=
	public static class listFriendRequest{
		String userId;
		int listtype; // 1：好友列表 2：请求推荐列表
		int categoryid; //listtype=1的时候有效
		int pageno;
		int pagesize;
		int sex;  // 0男，1女， “”是全部

	}
	
	//22.	删除好友
	//HTTP POST http://v.looklook.cn/vs/api/removeFriend
	//requestapp=
	public static class removeFriendRequest{
		String userId;
		String friendId;
		int categoryid; //listtype=1的时候有效
	}
	
	//23.	添加好友
	//HTTP POST http://v.looklook.cn/vs/api/addFriend
	//requestapp=
	public static class addFriendRequest{
		String userId;
		String friendId;
		int categoryid; //listtype=1的时候有效
	}
	
	//24.	好友消息列表
	//HTTP GET http://v.looklook.cn/vs/api/listFriendNote
	//requestapp=
	public static class listFriendNoteRequest{
		String userId;
		String pageno; //”22”
		String pagesize; //”22”
		String messagetype; //”0,1,2” // 需要查询消息的act类型

	}
	
	//25.	列表好友分类
	//HTTP GET http://v.looklook.cn/vs/api/listFriendCategory
	//requestapp=
	public static class listFriendCategoryRequest{
		String userId;
	}
	
	//26.	删除好友分类
	//HTTP POST http://v.looklook.cn/vs/api/removeFriendCategory
	//requestapp=
	public static class removeFriendCategoryRequest{
		String userId;
		int categoryid;
	}	
	
	//27.	添加好友分类
	//HTTP POST http://v.looklook.cn/vs/api/addFriendCategory
	//requestapp=
	public static class addFriendCategoryRequest{
		String userId;
		String  name; //"朋友"
	}	
	
	//28.	修改好友的分类
	//HTTP POST http://v.looklook.cn/vs/api/modFriend2Category
	//requestapp=
	public static class modFriend2CategoryRequest{
		String userId; //当前登录用户
		int friendId; //111,//好友
		int categoryId; //1111,
		int oldcategoryId; //22
	}	
	
	//30.	发送第三方关注人
	//HTTP POST http://v.looklook.cn/vs/api/postFollow?requestApp=
	public static class postFollowRequest{
		String userId; //当前登录用户
		int snstype; 
		postFollowItem[] items;
	}
	
	//31.	自动登录设置deviceToken绑定
	//HTTP POST http://v.looklook.cn/vs/api/user/removeToken?requestapp
	public static class removeTokenRequest{
		String userId; //当前登录用户
		String devicetoken; 
		int type; //1绑定 2解绑
		String imei; //
	}
	
	//32.	举报
	//HTTP POST http://v.looklook.cn/vs/api/report?requestapp=
	public static class reportRequest{
		String userId; //当前登录用户
		int videoId; //
		String content; //可以为空
	}
	
	//33.	给后台发社区转发数、评论数、回复数
	//HTTP POST http://v.looklook.cn/vs/api/postWeiboCount?requestapp=
	public static class postWeiboCountRequest{
		String userId; //当前登录用户
		int videoId; //
		postWeiboCountItem sns; 
	}
	
	//34.	忘记密码
	//HTTP POST http://v.looklook.cn/vs/api/user/forgetPassword
	//requestapp=
	public static class forgetPasswordRequest{
		String email; //”a@example.com”
	}
	
	//36.	视频详情-站内评论列表
	//HTTP POST http://v.looklook.cn/vs/api/commentlist?requestapp=
	public static class commentlistRequest{
		String userId; //当前登录用户
		int videoid; //22,
		int pageno; 
		int pagesize;
	}
	
	//37.	发表/回复评论
	//HTTP POST http://v.looklook.cn/vs/api/comment?
	//requestapp=
	public static class commentRequest{
		String userId; //当前登录用户
		int videoid; //22,
		String commentcontent; //”这个视频真好玩”
		int isReply; //0,//0：评论，1：回复评论
		int commentid; //12312 //评论id
	}
	
	//38.	删除视频
	//HTTP POST http://v.looklook.cn/vs/api/deleteVideo？
	//Requestapp=
	public static class deleteVideoRequest{
		String userId; //当前登录用户
		VideoItems[] item;
	}
	
	//39.	确认添加好友
	//HTTP POST http://v.looklook.cn/vs/api/sureAdd?Requestapp=
	public static class sureAddRequest{
		String userid; //当前登录用户
		String friendid; 
		String noteid;
		String type;
		String categoryId;
	}
	
	//40.	获取视频URL
	//HTTP POST http://v.looklook.cn/vs/api/getVideoUrl?Requestapp=
	public static class getVideoUrlRequest{
		String videoid;
	}
	
	//41.	视频详情
	//HTTP POSThttp://v.looklook.cn/vs/api/getVideoInfo?requestapp=
	public static class getVideoInfoRequest{
		String userid; //当前登录用户
		String videoid;  //视频id
		String videowidth; //封面需要显示的宽度，可以为空
		String videoheight; //封面需要显示的高度，可以为空
	}
	
	//42.	我的网盘
	//HTTP POST http://v.looklook.cn/vs/api/listMyNetVideo?requestapp=
	public static class listMyNetVideoRequest{
		int pageno; // 1,页号
		int pagesize; //10，每页记录数

		String userId; //当前登录用户
		String videowidth; //封面需要显示的宽度，可以为空
		String videoheight; //封面需要显示的高度，可以为空
	}
	
    //43.	验证注册用户名是否可用
	//HTTP POST http://v.looklook.cn/vs/api/user/checkUserNameExist?Requestapp=
	public static class checkUserNameExistRequest{
		String equipmentid; //"976543"
		String username; // "zhangsan"//base64编码

	}
	
	//44.	搜索用户列表
	//HTTP POST http://v.looklook.cn/vs/api/searchUser?requestapp=
	public static class searchUserRequest{
		String userId; //"9876543212345678",
		String keyword; // "张三"
		String pageno; //"1"
		String pagesize; //"10"
	}
	
	//45.	确认视频分享
	//HTTP POST http://v.looklook.cn/vs/api/confirmVideoShare?requestapp=
	public static class confirmVideoShareRequest{
		String userId; //"9876543212345678",
		String videoid; 
	}
	
	//46.	搜索附近视频（除自己视频外）
	//HTTP POST http://v.looklook.cn/vs/api/nearVideo
	//requestapp=
	public  static class nearVideoRequest{
		public String userid; // "765432345678",//当前登录用户数
		public String pageno; // 1,页号
		public String pagesize; //"16", 每页记录数
		
		public String  longitude; //"116.491602",//分享经度，可能为空
		public String latitude; //"39.911370”",//分享纬度可能为空
		public String videowidth; //”320”,  // 封面需要显示的宽度，可以为空
		//String videoheight; //”22322”  // 封面需要显示的高度，可以为空
	}
	
	//47.	获取标签
	//HTTP POST http://v.looklook.cn/vs/api/video/taglist?requestapp=
	public static class taglistRequest{
		String userId; //"9876543212345678",
		String videoid; 
	}
	
	//48.	关注
	//HTTP POST http://v.looklook.cn/vs/api/user/attention?requestapp=
	public static class attentionRequest{
		String userId; //"9876543212345678",
		String attention_userid; 
	}
	
	//49.	我的关注列表
	//HTTP POST http://v.looklook.cn/vs/api/user/myattentionlist?requestapp=
	public static class myattentionlistRequest{
		String userId; //"9876543212345678",
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		int sex; //1 // 0男，1女， “”是全部

	}
	
	//50.	我的粉丝
	//HTTP POST http://v.looklook.cn/vs/api/user/myfanslist?requestapp=
	public static class myfanslistRequest{
		String userId; //"9876543212345678",
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		int sex; //1 // 0男，1女， “”是全部
	}
	
	//51.	动态：全部视频信息，包括自己的，转发的，关注的，好友的
	//HTTP POST http://v.looklook.cn/vs/api/timeline?requestapp=
	public static class timelineRequest{
		String userId; //"9876543212345678",
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		String videowidt; //”12313”,  // 封面需要显示的宽度，可以为空
		String videoheight; //”22322”  // 封面需要显示的高度，可以为空
		int type; // 1 // 1全部  2好友  3关注  4我的

	}
	
	//52.	取消关注\删除粉丝
	//HTTP POST http://v.looklook.cn/vs/api/user/cancelattention?requestapp=
	public static class cancelattentionRequest{
		String userid; //"9876543212345678",
		String target_userid; 
		int type; //1:取消关注 2：删除粉丝

	}
	
	//53.	发私信
	//HTTP POST http://v.looklook.cn/vs/api/sendmessage?requestapp=
	public static class sendmessageRequest{
		String userid; //"9876543212345678",
		String target_userid; 
		String content; //内容

	}
	
	//54.	获取私信
	//HTTP POST http://v.looklook.cn/vs/api/getprivatemessage?requestapp=
	public static class getprivatemessageRequest{
		String userid; //"9876543212345678",
		String receive_userid; 
	}
	
	//55.	视频推荐：有标签按标签推送，没有按照时间推荐
	//HTTP POST http://v.looklook.cn/vs/api/videorecommend?requestapp=
	public static class videorecommendRequest{
		String userId; //"9876543212345678",
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		String videowidt; //”12313”,  // 封面需要显示的宽度，可以为空
		String videoheight; //”22322”  // 封面需要显示的高度，可以为空
		String index; 
		String signpage; // 1为2.0版本以后 空为2.0以前版本
	}
	
	//56.	喜欢
	//HTTP POST http://v.looklook.cn/vs/api/enjoy?requestapp=
	public static class enjoyRequest{
		String userid; //"9876543212345678",
		String videoid; 
	}
	
	//57.	解除微博绑定
	//HTTP POST http://v.looklook.cn/vs/api/removeWeibo?requestapp=
	public static class removeWeiboRequest{
		String userid; //"9876543212345678",
		String snstype; 
	}
	
	//58.	删除评论（删除自己评论和删除对自己视频进行的评论）
	//HTTP POST http://v.looklook.cn/vs/api/deleteComment?requestapp=
	public static class deleteCommentRequest{
		String userid; //"9876543212345678",
		int videoid;  //当前视频
		int commentid; //当前评论id
	}
	
	//59.	设置视频封面
	//HTTP POST  http://v.looklook.cn/vs/api/user/newModCover
	//requestapp=
	public static class newModCoverRequest{
		int videoid;  //视频id
		String imagePath; //”201212/03/543213609KJH76.jpg”
	}
	
	//60.	设置用户头像
	//HTTP POST  http://v.looklook.cn/vs/api/user/updateHead
	//requestapp=
	public static class updateHeadRequest{
		String userid;  //"9876543212345678",
		String imagePath; //”201212/03/543213609KJH76.jpg”
	}
	
	//61.	修改密码
	//HTTP POST  http://v.looklook.cn/vs/api/user/modPassword
	//requestapp=
	public static class modPasswordRequest{
		String userid;  //"9876543212345678",
		String oldPassword; //
		String newPassword;
	}
	
	//62.	用户评论列表（包括回复的）
	//HTTP POST http://v.looklook.cn/vs/api/commentlistforuser?requestapp=
	public static class commentlistforuserRequest{
		String userid;  //"9876543212345678",
		int pageno; 
		int pagesize; //

	}
	
	//63.	获取我的好友ID（缓存全部）
	//HTTP POST http://v.looklook.cn/vs/api/listFriendId?requestapp=
	public static class listFriendIdRequest{
		String userid;  //"9876543212345678",

	}
	
	//64.	获取活动列表（缓存）
	//HTTP POST http://v.looklook.cn/vs/api/activeList?requestapp=
	public static class activeListRequest{
		String userid;  //"9876543212345678",
		int activetype; //0所有活动 1有效活动
		String videoid; //当前视频id

	}
	
	//65.	参与视频列表
	//HTTP POST http://v.looklook.cn/vs/api/activeVideoList?requestapp=
	public static class activeVideoListRequest{
		int pageno; // 1,页号
		int pagesize; //10，每页记录数
		String userId; // "11111"  // 当前操作人
		String videowidth; //"12313”,  // 封面需要显示的宽度，可以为空
		String videoheight; //”22322”  // 封面需要显示的高度，可以为空
		String active_id; //”123213”
		String signpage; //”1” 1为2.0版本以后 空为2.0以前版本
		String index; //”22322”

	}
	
	//66.	中奖视频列表
	//HTTP POST http://v.looklook.cn/vs/api/getAwardUserList?requestapp=
	public static class getAwardUserListRequest{
		String userId; // "11111"  // 当前操作人
		String active_id; //”123213”
	}

	//67.	设置活动图片
	//HTTP POST  http://v.looklook.cn/vs/api/updateActiveImage
	//requestapp=
	public static class updateActiveImageRequest{
		int activeid ; // "11111"  // 当前操作人
		String imagePath; //”123213”
	}
	
	//68.	删除消息
	//HTTP POST http://v.looklook.cn/vs/api/deleteMessage?
	//requestapp=
	public static class deleteMessageRequest{
		String userid ; // "11111"  // 当前用户ID
		int noteid; //当前评论id
	}
	
	//69.	第三方互为关注的用户（以在LOOKLOOK注册的用户）
	//HTTP POST http://v.looklook.cn/vs/api/listThirdPlatformUser?requestapp=
	public static class listThirdPlatformUserRequest{
		String userid ; // "11111"  // 当前用户ID
		int pagesize; //
		String index; //”ddd_ddd_dd”//第一页为空
	}
			
	//70.	获取消息数
	//HTTP POST http://v.looklook.cn/vs/api/getMessageCount?requestapp=
	public static class getMessageCountRequest{
		String userid ; // "11111"  // 当前用户ID
		String active_id; //当前评论id
	}
	
	//71.	获取视频喜欢人列表
	//HTTP POST http://v.looklook.cn/vs/api/getVideoEnjoyUsers?requestapp=
	public static class getVideoEnjoyUsersRequest{
		String userid ; // "11111"  // 当前用户ID
		String videoid; // “2432”
		String pagesize; //10每页记录数
		String index; //”22322” 

	}
	
	//72.	获取视频转发人列表
	//HTTP POST http://v.looklook.cn/vs/api/getVideoForwardUsers?
	//requestapp=
	public static class getVideoForwardUsersRequest{
		String userid ; // "11111"  // 当前用户ID
		String videoid; // “2432”
		String pagesize; //10每页记录数
		String index; //”22322” 

	}
	
	//73.	设置空间背景图片
	//HTTP POST  http://v.looklook.cn/vs/api/user/userbackcover
	//requestapp=
	public static class userbackcoverRequest{
		String userid ; // "11111"  // 当前用户ID
		String imagePath; //”201212/03/543213609KJH76.jpg”

	}
	
	//74.	获取空间背景图片列表
	//HTTP POST  http://v.looklook.cn/vs/api/user/getbackgroundlist?requestapp=
	public static class getbackgroundlistRequest{
		String userid ; // "11111"  // 当前用户ID
		int Pagesize; //1条数
		String Index; //“ddd_dd”索引
	}

	//75.	赞视频列表
	//HTTP POST http://v.looklook.cn/vs/api/listEnjoyVideo?requestapp=
	public static class listEnjoyVideoRequest{
		int pagesize; //10，每页记录数
		String userId; // "11111" //当前登录用户数
		String index; //”22322” 
		String videowidth; //”12313”,  // 封面需要显示的宽度，可以为空
		String videoheight; //”22322”  // 封面需要显示的高度，可以为空

	}
	
	public class SNS{
		int snstype; //微博类型
		String snsid;   //微博用户ID
		String weiboid; //微博ID
	}
	
	public class VideoItems{
		String videoid; //
	}
	
	
	public class postFollowItem{
		String snsuid; 
		String snsphotourl; //”http://……”,//头像，可以为空
		String snssex; //性别，0男 1女 2未知
		String createtime; //”2012-1-2”,//在微博创建时间，可以为空
		String nickname; //"goodboy"
	}
	
	public class postWeiboCountItem{
		int snstype; //1,//微博代号，1：新浪微博，6：腾讯微博
		int forwardCount; //1212,//转发数
		int commentCount; //111,//评论数
		int collectionCount; //1112//收藏数

	}

}
