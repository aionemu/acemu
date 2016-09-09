package languages;

import com.aionemu.commons.utils.i18n.CustomMessageId;
import com.aionemu.commons.utils.i18n.Language;

public class China extends Language {

	public China() {
		super("CN");
		addSupportedLanguage("cn_CN");
		addTranslatedMessage(CustomMessageId.LOADING, "加载: %s");
		addTranslatedMessage(CustomMessageId.NO_PROPERTIES, "未找到配置文件");
		addTranslatedMessage(CustomMessageId.CANT_LOAD, "无法加载配置文件: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO, "+----");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO1, "| 服务器内存整理时间 %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO2, "|    |");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO3, "| 内存总量: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO4, "|    |= 分配内存: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO5, "|    |= 空闲内存: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO6, "| 分配内存: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO7, "|    |= 已用内存: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO8, "|    |= 未用内存: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO9, "| 可用内存: %s");
		addTranslatedMessage(CustomMessageId.CPU, "处理器核心: %s");
		addTranslatedMessage(CustomMessageId.CPU1, "处理器标识: %s");
		addTranslatedMessage(CustomMessageId.OS, "操作系统: %s 版本: %s");
		addTranslatedMessage(CustomMessageId.OS1, "处理器: %s");
		addTranslatedMessage(CustomMessageId.JAVA, "JAVA 平台信息");
		addTranslatedMessage(CustomMessageId.JAVA1, "JAVA 运行名称: %s");
		addTranslatedMessage(CustomMessageId.JAVA2, "JAVA 版    本: %s");
		addTranslatedMessage(CustomMessageId.JAVA3, "JAVA 类 版 本: %s");
		addTranslatedMessage(CustomMessageId.JVM, "虚拟机信息(JVM)");
		addTranslatedMessage(CustomMessageId.JVM1, "名    称: %s");
		addTranslatedMessage(CustomMessageId.JVM2, "安装路径: %s");
		addTranslatedMessage(CustomMessageId.JVM3, "版    本: %s");
		addTranslatedMessage(CustomMessageId.JVM4, "发行公司: %s");
		addTranslatedMessage(CustomMessageId.JVM5, "信    息: %s");
		addTranslatedMessage(CustomMessageId.DATABASE_FULL, "成功连接数据库！");
		addTranslatedMessage(CustomMessageId.THREADPOOL, "初始化线程 %s 线程 %s 即时线程 %s 长时间运行线程");
		addTranslatedMessage(CustomMessageId.KEY, "初始化注册机...");
		addTranslatedMessage(CustomMessageId.GAME_LOAD, "载入 %s 个已注册的游戏服务器！");
		addTranslatedMessage(CustomMessageId.BAN_IP, "载入 %s 个封停IP地址！");
		addTranslatedMessage(CustomMessageId.DAO, "载入 %s 个上下文脚本！");
		addTranslatedMessage(CustomMessageId.NIOSERVERALL, "开放端口 %s 等待%s");
		addTranslatedMessage(CustomMessageId.NIOSERVER, "开放端口 %s 等待来自 %s 的%s");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS, "游戏服务器连接.");
		addTranslatedMessage(CustomMessageId.AION_CONNECTIONS, "客户端连接.");
		addTranslatedMessage(CustomMessageId.PLAYER_TRANSFER, "玩家转区服务将在 10 秒后初始化.");
		addTranslatedMessage(CustomMessageId.PLAYER_TRANSFER_TASK, "玩家转区服务初始化. %s 个任务.");
		addTranslatedMessage(CustomMessageId.TASK_FROM_DB, "从数据库加载 %s 个自动重启线程的第 %s 个线程.");
		addTranslatedMessage(CustomMessageId.PREMIUM, "高级控制器准备就绪，等待接受请求.");
		addTranslatedMessage(CustomMessageId.LOGIN_STARTED, "登录服务器启动耗时 %s 秒.");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS1, "收到来自 %s 的游戏服务器连接.");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS2, "#%s 号游戏服务器连接成功.");
		addTranslatedMessage(CustomMessageId.PING_PONG, "开始检测 #%s 号游戏服务器连接状态");
		addTranslatedMessage(CustomMessageId.LOGIN_CONNECTIONS, "收到来自 %s 的客户端连接.");
		addTranslatedMessage(CustomMessageId.GS_DISCONNECTED1, "%s 连接中断.");
	}
}
