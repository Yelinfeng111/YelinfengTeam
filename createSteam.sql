/*创建数据库*/
CREATE DATABASE MySteam;

/*使用数据库*/
USE MySteam;

/*创建用户表*/
CREATE TABLE users
(
	user_id  INT PRIMARY KEY AUTO_INCREMENT,
	user_name VARCHAR(50) NOT NULL,
	user_password VARCHAR(50) NOT NULL
)CHARSET=utf8;

/*创建游戏类型表*/
CREATE TABLE game_type
(
	type_id  INT PRIMARY KEY AUTO_INCREMENT, /*类型ID*/
	type_name VARCHAR(50) NOT NULL           /*类型名称*/
)CHARSET=utf8;

/*在游戏类型表插入数据*/
INSERT INTO game_type VALUES(DEFAULT,'免费'),
			(DEFAULT,'单人'),
			(DEFAULT,'多人'),
			(DEFAULT,'休闲'),
			(DEFAULT,'格斗'),
			(DEFAULT,'动作'),
			(DEFAULT,'冒险'),
			(DEFAULT,'射击'),
			(DEFAULT,'大型多人对战'),
			(DEFAULT,'玩家对战'),
			(DEFAULT,'竞技'),
			(DEFAULT,'角色扮演'),
			(DEFAULT,'街机');

/*创建游戏表*/
CREATE TABLE game
(
	game_id INT PRIMARY KEY AUTO_INCREMENT,/*游戏ID*/
	game_name VARCHAR(50) NOT NULL, 	/*游戏名称*/
	game_publishDate DATE NOT NULL,         /*发行日期*/
	game_modifyDate DATE NOT NULL,		/*更新日期*/
	game_developer VARCHAR(50) NOT NULL, 	/*开发商名称*/
	game_distributor VARCHAR(50) NOT NULL, 	/*发行商名称*/
	game_before_price DOUBLE(8,2) NOT NULL,	/*游戏原价($)*/
	game_after_price DOUBLE(8,2) NOT NULL,  /*打折后游戏价格($)*/
	game_diskSpace INT NOT NULL,		/*游戏所需内存(GB)*/
	game_introduction LONGTEXT NOT NULL, 	/*游戏介绍*/
	game_imagePath VARCHAR(100) NOT NULL,	/*游戏图片路径*/
	game_quantities INT NOT NULL,		/*已购数量*/
	game_state INT NOT NULL 		/*游戏状态(0.预约 1.开售)*/
)CHARSET=utf8;

/*在游戏表中插入数据*/
INSERT INTO game VALUES(DEFAULT,'PLAYERUNKNOWN\'S BATTLEGROUNDS','2017-12-21','2017-12-21','PUBG Corporation','PUBG Corporation',98,98,6,'绝地求生(PLAYERUNKNOWN’S BATTLEGROUNDS)是战术竞技类游戏，
				每一局游戏将有100名玩家参与，他们将被投放在绝地岛(battlegrounds)的上空，游戏开始跳伞时所有人都一无所有。
				游戏展开的方式是：玩家赤手空拳地分布在岛屿的各个角落，利用岛上多样的武器与道具。
				随着时间的流逝，岛上的安全地带越来越少，特定地区也会发生爆炸的情况，最终只有一人存活获得胜利。','img/game1.img',100,1),
			(DEFAULT,'Sky Hunter','2017-11-20','2017-11-20','Codex7','Codex7',39,39,1,'Sky Hunter是一款3D直升机对战游戏。
				操控简单，战斗激烈。
				快速加入8人战斗，5大主题地图。在战斗中用导弹锁定敌人可造成更大的伤害。另有其它战斗模式随机开启。
				飞机操作简单，视觉效果惊艳。在战斗中不断挑战自己，达到更高等级。通过升级涂装，打造更强大战机。
				飞行员们，空中的战斗已打响，赶快加入吧！！！','img/game2.img',0,0),
			(DEFAULT,'Grand Theft Auto V','2015-4-11','2015-4-11',' Rockstar North','Codex7',198,198,72,'一个初涉江湖的街头新丁、一个洗手多年的银行劫匪和一个丧心病狂的杀人狂魔，
				误打误撞中深陷犯罪集团、美国政府和娱乐产业之间盘根错杂的恐怖困境。他们必须齐心协力，接连完成九死一生的惊天劫案，才能在这个冷血无情的城市中苟延残喘。不要相信任何人，
				尤其是你的同伙！','img/game2.img',1000,1);
SELECT * FROM game;

/*创建新闻表*/
CREATE TABLE game_new
(
	new_id INT PRIMARY KEY AUTO_INCREMENT,	/*新闻ID*/
	new_name VARCHAR(50) NOT NULL,		/*新闻名称*/
	new_introduction LONGTEXT NOT NULL,	/*游戏介绍*/
	new_gameId INT NOT NULL,		/*新闻所属游戏Id*/
	new_publishDate DATE NOT NULL 		/*新闻发行日期*/
)CHARSET=utf8;

