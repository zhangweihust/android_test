package com.zhangwei.common.gson;


public  class GsonResponse {
	
	//1.手机UA协议
	public static class uaResponse{
		int status;
		String equipmentid;
		String ip;
	}
	
	//2. 用户注册
	public static class registerResponse{
		int status; //0：成功，1：用户帐号已存在，用户信息没有
		String userId; //用户ID
		String nickname; //用户昵称
		String portraitUrl; //头像地址，可以为空
		String sex; //0男 1女 2未知
		String address; //”北京朝阳”
		String birthdate;
		String tag; //”心情不错”
		String app_downloadurl; //http://t.cn/zj9WidU”//looklook官方下载地址
	}
	
	//4. 修改用户信息
	public static class changeUserInfoResponse{
		int status; //0:成功，1：用户名已存在
		String portraitUrl;
	}
	
	//5.	修改水印
	public static class watermarkResponse{
		int status; //0:成功，1：用户名已存在
	}
	
	//6.	用户登录
	public static class loginResponse{
		int status; //0：成功，1：第三方登录账号不存在,创建新账号, 2密码错误，3用户不存在 
		String userId; //用户ID
		String nickname; //用户昵称
		String portraitUrl; //头像地址
		String watermark;  //水印
		MySNS sns[];
		String sex;
		String birthdate;
		String address;
		String tag; //可为空
		String app_downloadurl; //"http://t.cn/zj9WidU"//looklook官方下载地址
	}
	

	//9.	获取Socket IP 端口
	public static class getSocketResponse{
		int status; //0:成功，1：用户名已存在
		String IP;
		String port;
		String spacesize; //”2048M”
		String maxsize; //”2048M”
		String videopath; //”/data/…/123.mp4”,服务器给定的path
	}

	//10.	创建视频ID 
	public static class getVideoIdResponse{
		int status; //0:成功，1：用户名已存在
        int videoID; //333, //视频ID
	}
	
	//11.	分享好友
	public static class shareLookResponse{
		int status; //0:成功，
	}
	
	//12.	我的视频
	public static class listMyVideoResponse{
		int status; //0:成功，
		MyVideo[]  items;
	}
	
	//13.	列表好友视频
	public static class listFriendVideoResponse{
		int status; //0:ok, 1:没有记录
		FriendVideo[] items;
	}
	
	//14.	列表收藏视频
	public static class listFavoriteVideoResponse{
		int status; //0:ok, 1:没有记录
		FriendVideo[] items;
	}
	
	
	//15.	收藏视频
	public static class addFavoriteResponse{
		int status; //0成功，1失败 
	}
	
	//16.	收藏删除
	public static class removeFavoriteResponse{
		int status; //0成功，1失败, 
	}
	
	
	//17.	发送统计信息
	public static class postLogResponse{
		int status; //0成功，1失败, 
	}
	
	//18.	意见反馈
	public static class feedbackResponse{
		int status; //0成功，1失败, 
	}
	
	
	//19.	上传视频点击量提醒
	public static class getUserRemindResponse{
		int status; //0成功，1失败, 
		getUserRemindItem[] items;
	}
	
	//20.	绑定微博
	public static class bindWeiboResponse{
		int status; //0成功，1失败, 
	}
	
	//21.	好友列表/推荐列表
	public static class listFriendResponse{
		int status; //0成功，1失败, 
		User[] items;
	}	
	
	//22.	删除好友
	public static class removeFriendResponse{
		int status; //0成功，1失败, 
	}
	
	//23.	添加好友
	public static class addFriendResponse{
		int status; //0成功，1失败, 
	}
	
	//24.	好友消息列表
	public static class listFriendNoteResponse{
		int status; //0成功，1失败, 
		listFriendNoteItem[] items;
	}
	
	//25.	列表好友分类
	public static class listFriendCategoryResponse{
		int status; //0成功，1失败, 
		listFriendCategoryItem[] items;
	}
	
	//26.	删除好友分类
	public static class removeFriendCategoryResponse{
		int status; //0成功，1失败, 
	}
	
	//27.	添加好友分类
	public static class addFriendCategoryResponse{
		int status; //0：成功，2：分类已存在,
		int categoryid; //121212, 分类ID
	}
	
	//28.	修改好友的分类
	public static class modFriend2CategoryResponse{
		int status; //0：成功
	}	
	
	//30.	发送第三方关注人
	public static class postFollowResponse{
		int status; //0：成功
	}
	
	//31.	自动登录设置deviceToken绑定
	public static class removeTokenResponse{
		int status; //0：成功，1：失败（非最新登录）
		String app_downloadurl; //http://t.cn/zj9WidU”//looklook官方下载地址
	}
	
	
	//32.	举报
	public static class reportResponse{
		int status; //0：成功，1：失败）
	}
	
	//33.	给后台发社区转发数、评论数、回复数
	public static class postWeiboCountResponse{
		int status; //0：成功，1：失败
	}
	
	//34.	忘记密码
	public static class forgetPasswordResponse{
		int status; //0：处理成功,1：没有这个账号
	}
	
	//36.	视频详情-站内评论列表
	public static class commentlistResponse{
		int status; //0：处理成功,
		commentlistItem[] items;
	}
	
	//37.	发表/回复评论
	public static class commentResponse{
		int status; //0：处理成功,
	}
	
	//38.	删除视频
	public static class deleteVideoResponse{
		int status; //0：处理成功,
	}
	
	//39.	确认添加好友
	public static class sureAddResponse{
		int status; //0：处理成功,
	}
	
	//40.	获取视频URL
	public static class getVideoUrlResponse{
		int status; //0：处理成功,
		getVideoUrlItem[] items;
	}
	
	//41.	视频详情
	public static class getVideoInfoResponse{
		int status; //0：处理成功,
		String userId; //"11111",//好友ID
		String portraitUrl; //”http://…jpg”,//好友头像URL
		String nickname; //”好友昵称”,//好友昵称
		int videoid; //视频ID
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  //视频播放地址
		int videotimeMilli; //11111111,//毫秒数
		int playtimes; //40,播放次数
		
		//分享信息
		String snscontent; //"终于见到演员中的乔丹了"
		ShareSNS[] sns;
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		int collectCount; //11, 收藏数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		int sex; //0男，1女， 2未知
		String signature; //是编码的，需要解码
		int sharestatus;  //1公开  2好友可见 4私密
		String enjoycount; //123123
		String longitude;  //"80.234"
		String latitude;   //90.234
	}
	
	//42.	我的网盘
	public static class listMyNetVideoResponse{
		int status; //0：处理成功,	
		listMyNetVideoItem[] items;
	}
	
	//43.	验证注册用户名是否可用
	public static class checkUserNameExistResponse{
		int status; //0可用、1不可用	
	}
	
	//44.	搜索用户列表
	public static class searchUserResponse{
		int status; //0可用、1不可用	
		searchUserItem[] items;
	}
	
	//45.	确认视频分享
	public static class confirmVideoShareResponse{
		int status; //0正常、1失败	
	}
	
	//46.	搜索附近视频（除自己视频外）
	public static class nearVideoResponse{
		public String status; //0可用、1不可用	
		public nearVideoItem[] items;
		public String radius; //公里
	}
	
	//47.	获取标签
	public static class taglistResponse{
		int status; //0可用、1不可用	
		taglistItem[] items;
	}
	
	//48.	关注
	public static class attentionResponse{
		int status; //0成功	
	}
	
	//49.	我的关注列表
	public static class myattentionlistResponse{
		int status; //0成功	
		myattentionlistItem[] items;
	}
	
	//50.	我的粉丝
	public static class myfanslistResponse{
		int status; //0成功	
		myfanslistItem[] items;
		
	}
	
	//51.	动态：全部视频信息，包括自己的，转发的，关注的，好友的
	public static class timelineResponse{
		int status; //0成功	
		timelineItem[] items;		
	}
	
	//52.	取消关注\删除粉丝
	public static class cancelattentionResponse{
		int status; //0成功		
	}
	
	//53.	发私信
	public static class sendmessageResponse{
		int status; //0成功		
	}
	
	//54.	获取私信
	public static class getprivatemessageResponse{
		int status; //0成功		
		getprivatemessageItem[] items;
	}
	
	//55.	视频推荐：有标签按标签推送，没有按照时间推荐
	public static class videorecommendResponse{
		int status; //0成功		
		String index;
		String hasnextpage; //1有下一页，0没有下一页
		videorecommendItem[] items;
	}
	
	
	//56.	喜欢
	public static class enjoyResponse{
		int status; //0成功		
	}
	
	//57.	解除微博绑定
	public static class removeWeiboResponse{
		int status; //0成功		
	}
	
	//58.	删除评论（删除自己评论和删除对自己视频进行的评论）
	public static class deleteCommentResponse{
		int status; //0成功		
	}
	
	//59.	设置视频封面
	public static class newModCoverResponse{
		int status; //0成功	
		String imageUrl; //”http://iamge.looklook.cn/201212/03/543213609KJH76.jpg”
	}
	
	//60.	设置用户头像
	public static class updateHeadResponse{
		int status; //0成功	
		String imageUrl; //”http://iamge.looklook.cn/201212/03/543213609KJH76.jpg”
	}
	
	//61.	修改密码
	public static class modPasswordResponse{
		int status; //0成功	
		String oldPassword;
		String newPassword;
	}
	
	//62.	用户评论列表（包括回复的）
	public static class commentlistforuserResponse{
		int status; //0成功	
		commentlistforuserItem[] items;
	}
	
	//63.	获取我的好友ID（缓存全部）
	public static class listFriendIdResponse{
		int status; //0成功	
		listFriendIdItem[] items;
	}
	
	//64.	获取活动列表（缓存）
	public static class activeListResponse{
		int status; //0成功	
		listFriendIdItem[] items;
	}
	
	//65.	参与视频列表
	public static class activeVideoListResponse{
		int status; //0成功	
		String index; //
		String hasnextpage; //1有下一页，0没有下一页
		activeVideoListItem[] items;
	}
	
	//66.	中奖视频列表
	public static class getAwardUserListResponse{
		int status; //0成功	
		getAwardUserListItem[] items;
	}
	
	//67.	设置活动图片
	public static class updateActiveImageResponse{
		int status; //0成功	
		String imageUrl; //"http://iamge.looklook.cn/201212/03/543213609KJH76.jpg"
	}
	
	//68.	删除消息
	public static class deleteMessageResponse{
		int status; //0成功	
	}
	
	//69.	第三方互为关注的用户（以在LOOKLOOK注册的用户）
	public static class listThirdPlatformUserResponse{
		int status; //0成功	
		String index; //”ddd_dd_dd”
		int hasnextpage; //1有下一页，0没有下一页
		//排序,按昵称拼音排序
		listThirdPlatformUserItem[] items;
	}
	
	//70.	获取消息数
	public static class getMessageCountResponse{
		int status; //0成功	
		String primsg_count; //私信数量
		String addfri_notice_count; //添加好友的消息和纯文字的消息数量总和
		String act_count; //1：有新活动  ， 0：没有新活动
	}
	
	//71.	获取视频喜欢人列表
	public static class getVideoEnjoyUsersResponse{
		int status; //0成功	
		String index; //”ddd_dd_dd”
		int hasnextpage; //1有下一页，0没有下一页
		//排序,按昵称拼音排序
		getVideoEnjoyUsersItem[] items;
	}
	
	//72.	获取视频转发人列表
	public static class getVideoForwardUsersResponse{
		int status; //0成功	
		String index; //”ddd_dd_dd”
		int hasnextpage; //1有下一页，0没有下一页
		//排序,按昵称拼音排序
		getVideoForwardUsersItem[] items;
	}
	
	//73.	设置空间背景图片
	public static class userbackcoverResponse{
		int status; //0成功	
		String imageUrl; //”http://iamge.looklook.cn/201212/03/543213609KJH76.jpg”
	}
	
	//74.	获取空间背景图片列表
	public static class getbackgroundlistResponse{
		int status; //0成功	
		String index; //”ddd_dd_dd”
		int hasnextpage; //1有下一页，0没有下一页
		//排序,按昵称拼音排序
		getbackgroundlistItem[] items;
	}
	
	//75.	赞视频列表
	public static class listEnjoyVideoResponse{
		int status; //0成功	
		String index; //”ddd_dd_dd”
		int hasnextpage; //1有下一页，0没有下一页
		//排序,按昵称拼音排序
		listEnjoyVideoItem[] items;
	}
	
	public static class FriendListResponse{
		String status;
		User[] items;
		String radius;
	}
	
	
	
	
	
	
	
	
	public class User {
		String userId;
	    String portraitUrl; //头像URL，可为空
	    String nickname;
	    subUser[] tags;
	    String[] activeid;
	    int friendCount; //1,好友数
	    int videoCount;  //12,视频数
	    String category; //”家人”, 好友分类只对好友列表有效
	    int categoryid; //1111, 好友分类ID
	    int sex; //0男，1女， 2未知
	    int isattention; // 0 未关注  1是已关注
	    String signature; //”个性签名” , 是编码的，需要解码

	
	}
	
	public class subUser{
		String subitem;
	}
	
	
	public class MySNS{
		int snstype; //微博类型号，0:looklook,  1：新浪微博, 2:人人, 3:开心, 4:街旁, 5:qzone空间, 6:腾讯微博, 7:搜狐微博, 9:微信
		String snsid; //微博ID
	}
	
	public class ShareSNS{
		String id;
		String content; //”分享的内容1111”, base64
		ShareInfo[] shareinfo;
		String sharetime; //”2012-12-12 19:20:45” 分享时间
		
	}

	public class MyVideo{
		int videoid;
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  播放视频连接
		int videotimeMilli; //视频建立毫秒数
		int playtimes; //播放次数
		int orshare; //1:分享、2:未分享
		String snscontent;//”终于见到演员中的乔丹了”, 分享信息
		ShareSNS[] sns;
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		int collectCount; //11, 收藏数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		int sex; //0男，1女， 2未知
		String signature; //是编码的，需要解码
		int sharestatus;  //1公开  2好友可见 4私密
		String enjoycount; //123123
		String longitude;  //"80.234"
		String latitude;   //90.234
		
	}
	
	public class FriendVideo{
		String userId; //好友ID
		String portraitUrl; //”http://…jpg”,好友头像URL
		String nickname; //”好友昵称”,好友昵称
		int videoid; //视频ID
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”, 分享的视频连接
		int videotimeMilli; //in ms
		int playtimes; //40 //播放次数
		
		//分享信息
		String snscontent;  // 终于见到演员中的乔丹了
		ShareSNS[] sns;
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		int collectCount; //11, 收藏数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		int sex; //0男，1女， 2未知
		String signature; //是编码的，需要解码
		int sharestatus;  //1公开  2好友可见 4私密
		String enjoycount; //123123
		String longitude;  //"80.234"
		String latitude;   //90.234
		
	}
	
	public class TAG{
		String name; //”标签1”
		String id; //
	}
	
	
	public class nearVideoItem {

		//capture net:
		public String type;
		public String signature; //base64
		public String status;
		public String nickname; //base64
		public String sex;
		public String userid; //
		public String portraiturl;
		public String videoid;
		public String filetype;
		public VideoPath[] videopath;
		public String longitude; //"125.1234",//分享经度，可能为空
		public String latitude; //"16.1234”",//分享纬度可能为空
		public String position; //"东八里庄公交站"  base64
		public String isforward;
		public String snscontent; //终于见到演员中的乔丹了, base64
		public ShareSNS[] sns;
		public TAG[] tags; //TAG[]
		public String[] activeid; // --- to modiry !!!!!!!!
		public String commentcount; //1111,评论数
		public String forwardcount; //11121, 转发数
		public String createtime; //"2012-12-26 14:57:25"
		public String videocontent; //base64
		public String forward_signature;
		public String forward_userid;
		public String forward_portraiturl;
		public String forward_nickname;
		public String forward_sex;
		public String forward_content;
		public String snscollect_renren;
		public String snscollect_kaixin;
		public String enjoycount;
		public String snscollect_sina; //"123445,"
		public String snscollect_tencent;
		public String sharestatus;
		public String isattention;
		public String pic_width; //"360"
		public String pic_height; //"480"
		public String show_width; //"320"
		public String show_height; //"427"
		public String distance; //"0"
		public String overstatus; //""
		public String videoname;
		public String videolength; //"00:00:10"
		public String iscollect; //"0"
		public String collectcount; //"0"
		public String videoimage; //"http://...jpg"
		public String videosharepath; //"http://...mp4"
		public String videotimemilli; //"2013-02-04 22:43:57"
		public String playtimes; //"0"
		public String orshare; //"1"
		
		/// --doc define
	/*		String userId;
		String portraitUrl; //http://…jpg,//好友头像URL
		String nickname; //好友昵称
		String videoid;  //视频ID
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  //分享的视频连接
		int videotimeMilli; //11111111,//毫秒数
		int playtimes; //播放次数
		String longitude; //"125.1234",//分享经度，可能为空
		String latitude; //"16.1234”",//分享纬度可能为空
		int distance; //视频与手机之间的绝对距离，单位：米
		String videolength; //”1:1:1”
		
		//分享信息
		String snscontent; //终于见到演员中的乔丹了
		ShareSNS[] sns;
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		String enjoycount; //123123
	*/
		
	}

	
	//分享信息
	public class ShareInfo{
		
		String snsid; //”111111”,  snstype为0的时候没有值
		String snstype; // 0 本地  // 1新浪  // 6腾讯
		String weiboid; //”1212121”, snstype为0的时候没有
	}
	
	public class VideoPath{
		String type; //1高清、2普清、0原视频
		String transcodeurl;
		String videolongpath; //”http://.../123.mp4” 长连接
	}
	

	

	public class getUserRemindItem{
		String videoid;
		String videotitle;//”终于见到演员中的乔丹了”,第一个分享的内容，可为空
		String promptcontent; //”您这个视频被点击了100次”（100提醒、500、1000、2000、5000、10000）
	}
	
	public class listFriendNoteItem{
		int read; //1未读 2已读
		int noteid; //消息ID
		String userId; //"11111",//好友ID
		String nickname; //”昵称”,//好友昵称
		String portraitUrl; //”http://…jpg”,//头像URL，可能为空
		String from; //”新浪微博”,//来源
		int timeMill; //1111111112121,//发布时间的毫秒数
		int act; //0：加入looklook，1：添加好友，2：发视频   3：文字提醒 4：评论提醒
		String video; //”http://…mpg”, 视频地址，只有act=2才有值
		int videoid; //11111,//视频ID
		String videocover; //"http://..jpg",视频封面	
	    int isattention; //0 未关注  1是已关注
	    String signature; //”个性签名”  是编码的，需要解码
	    int sex; //
	    int commentid; //act为4的时候生效
	}
	
	public class listFriendCategoryItem{
		int categoryid; //分类ID
		String name; //家人, 分类名
	}
	
	public class commentlistItem{
		String userId; //评论用户ID
		String portraitUrl; //”http://…jpg”, 头像URL
		String nickname; //”昵称”,//昵称
		int videoid; 
		String commentcontent;//”好视频”, 评论
		int commentid; //1111, 评论ID
		String createtime; //”1616516519”  时间戳
		String signature; //”个性签名”  是编码的，需要解码
		int sex; //0男，1女， 2未知
		int isattention; // 0 未关注  1是已关注
	}
	
	public class getVideoUrlItem{
		int snstype; ////社区类型,looklook
		String url; //”http://host:port/path/0/…mp4”
	}
	
	public class listMyNetVideoItem{
		int videoid;
		int overstatus; //0 已传完 1未传完
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  播放视频连接
		int videotimeMilli; //视频建立毫秒数
		int playtimes; //播放次数
		int orshare; //1:分享、2:未分享
		
		//分享信息
		String snscontent; //"终于见到演员中的乔丹了"
		ShareSNS[] sns;
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		int collectCount; //11, 收藏数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		int sex; //0男，1女， 2未知
		String signature; //是编码的，需要解码
		int sharestatus;  //1公开  2好友可见 4私密
		String enjoycount; //123123
		String longitude;  //"80.234"
		String latitude;   //90.234
		
	}
	
	public class searchUserItem{
		String userId;
		String portraitUrl; //”http://…jpg”, 头像URL，可为空
		String nickname; //”昵称”,//昵称
		int friendCount; //好友数
		int videoCount; //视频数
		int isfriend; //0不是好友，1是好友
		int sex; // 0男，1女， 2未知
		String signature; //”个性签名”  是编码的，需要解码
	}
	

	
	public class taglistItem{
		String id;
		String name; //娱乐
		String checked; //1:被选中，0：未被选中
	}
	
	public class myattentionlistItem{
		String userId; //好友ID
		String portraitUrl; //"http://…jpg", 头像URL，可为空
		String nickname; //昵称
		int friendCount; //他的好友数
		int videoCount;  //视频数
		int sex; //0男 1女 2未知
		String signature; //"jdfdf"个人签名（base64编码）
	}
	
	public class myfanslistItem{
		String userId; //好友ID
		String portraitUrl; //头像URL，可为空
		String nickname; //昵称
		int friendCount; //他的好友数
		int videoCount;  //视频数
		int sex; //0男 1女 2未知
		int isattention; //0 未关注  1是已关注
		String signature; //个人签名（base64编码）
	}
	
	public class timelineItem{
		String userId;  //好友ID
		String portraitUrl; //好友头像URL
		String nickname; //好友昵称
		String forward_userid; //好友ID
		String forward_portraiturl; //”http://…jpg”,//好友头像URL
		String forward_nickname; //好友昵称
		String forward_content; //终于见到演员中的乔丹了
		String forward_sex; //0男 1女 2未知
		String forward_signature; //”个性签名”  //是编码的，需要解码
		int isforward; //1是转发  0不是转发
		int videoid; //视频ID
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  //分享的视频连接
		int videotimeMilli; //毫秒数
		int playtimes; //播放次数
		
		//分享信息
		String snscontent;//"终于见到演员中的乔丹了"
		ShareSNS[] sns;
		
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		String sex; //"0" 0男 1女 2未知
		int isattention; //0 未关注  1是已关注
		String signature; //”个性签名”  //是编码的，需要解码
		String enjoycount; //123123
	}
	
	public class getprivatemessageItem{
		String userid; //发送信息人ID
		String content; //”的佛教网i俄方年圣诞节覅违反 ”
		String portraitUrl; //头像URL，可为空
		String nickname; //昵称
		String isattention; //是否关注
		String sex; //”男”
		String signature; //”个人签名”
		String type; //1代表纯文字  2代表视频加文字
		String videoimage; //
		VideoPath[] videopath;
		
	}
	
	public class videorecommendItem{
		String userId;
		String portraitUrl;
		String nickname; //好友昵称
		int videoid; //视频ID
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  //分享的视频连接
		int videotimeMilli; //毫秒数
		int playtimes; //40,//播放次数
		
		//分享信息
		String snscontent;//"终于见到演员中的乔丹了"
		ShareSNS[] sns;
		
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		String enjoycount; //123123
	}
	
	public class commentlistforuserItem{
		String userId; //评论用户ID
		String portraitUrl; //头像URL
		String nickname; //昵称
		int videoid;
		String commentcontent; //”好视频”//评论
		int commentid; //
	}
	
	public class listFriendIdItem{
		int userid;
	}
	
	public class activeListItem{
		String activeid; //活动ID
		String activename; //活动名称
		String starttime; //开始时间
		String endtime; //结束时间
		String introduction; //简介
		String add_way; //参与方式
		String rule; //活动规则
		String prize; //奖品
		String picture; //图片地址
		String isjoin; //1代表参加  0 代表未参加
		String iseffective; //"1结束 0可以参与 2未开始"
		
	}
	
	public class activeVideoListItem{
		int videoid; 
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  播放视频连接
		int videotimeMilli; //视频建立毫秒数
		int playtimes; //播放次数
		int orshare;//1:分享、2:未分享
		
		//分享信息
		String snscontent;//"终于见到演员中的乔丹了"
		ShareSNS[] sns;
		
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高
		int sex; //0男，1女， 2未知
		String signature; //”个性签名”  //是编码的，需要解码
		String sharestatus; //1公开  2好友可见 4私密
		
		
		
	}
	
	public class subAwardItem{
		String userId; //好友ID
		String portraitUrl;  //头像URL，可为空
		String nickname; //昵称
		int friendCount; //好友数
		int videoCount;  //视频数
		String category; //”家人”//好友分类只对好友列表有效
		int categoryid; //好友分类ID
		String sex; // 0男，1女， 2未知
		int isattention; //0 未关注  1是已关注
		String signature; //”个性签名”  //是编码的，需要解码
	}
	
	public class getAwardUserListItem{
		String awarded;
		String awardname; //奖项名称
		subAwardItem[] items;
		
	}
	
	public class listThirdPlatformUserItem{
		String userId; //好友ID
		String portraitUrl; //”http://…jpg”,//头像URL，可为空
		String nickname; //昵称
		int sex; //0男，1女， 2未知
		String signature; //”个性签名”  //是编码的，需要解码
	}

	public class getVideoEnjoyUsersItem{
		String userId; //用户ID
		String portraitUrl; //头像URL，可为空
		String nickname; //昵称
		int friendCount; //好友数
		int videoCount; //视频数
		int isfriend; //0不是好友，1是好友
		int sex; //0男，1女， 2未知
		String signature; //是编码的，需要解码
		String enjoycount; //喜欢人总数
	}
	
	public class getVideoForwardUsersItem{
		String userId; //用户ID
		String portraitUrl; //头像URL
		String nickname; //昵称
		int friendCount; //好友数
		int videoCount;  //视频数
		int isfriend; //0不是好友，1是好友
		int sex;  // 0男，1女， 2未知
		String signature; //”个性签名”  //是编码的，需要解码
	}
	
	public class getbackgroundlistItem{
		String portraitUrl;  //头像URL，可为空
		String backgroundimage; //图片路径
	}
	
	public class listEnjoyVideoItem{
		String userId; //好友ID
		String portraitUrl; //好友头像URL
		String nickname; //好友昵称
		int videoid; //视频ID
		String videoimage; //"http://.../123.jpg"
		String videosharepath; //”http://.../123.mp4”,  //分享的视频连接
		int videotimeMilli; //毫秒数
		int playtimes; //播放次数
		
		//分享信息
		String snscontent;//"终于见到演员中的乔丹了"
		ShareSNS[] sns;
		
		String snscollect_sina; //”1231,12312,12312” 所有分享到新浪的微博id
		String snscollect_tencent; //”12312,1231,12312” // 所有分享到腾讯的微博id
		
		//下面的字段在视频详情里用到
		String position; //"东八里庄公交站"
		int commentCount; //1111,评论数
		int forwardCount; //11121, 转发数
		VideoPath[] videopath;
		int iscollect; //1：已收藏，0：未收藏
		TAG[] tags;
		
		int pic_width;   //”2131”, 封面本身的宽
		int pic_height;  //”1231”, 封面本身的高
		int show_width;  //封面显示的宽
		int show_height; //封面显示的高

		String enjoycount; //
		int isattention; //0 未关注  1是已关注
	}
}
