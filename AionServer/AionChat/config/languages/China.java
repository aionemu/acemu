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
		addTranslatedMessage(CustomMessageId.NIOSERVERALL, "开放端口 %s 等待%s");
		addTranslatedMessage(CustomMessageId.NIOSERVER, "开放端口 %s 等待来自 %s 的%s");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS, "游戏服务器连接.");
		addTranslatedMessage(CustomMessageId.CHAT_STARTED, "聊天服务器启动耗时 %s 秒.");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS1, "收到来自 %s 的游戏服务器连接.");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS2, "#%s 号游戏服务器连接成功.");
		addTranslatedMessage(CustomMessageId.CLIENT_CONNECTIONS, "收到来自 %s 的客户端连接.");
		addTranslatedMessage(CustomMessageId.CLIENT_HACK, "角色名异常，注册角色名: %s 实际角色名: %s.");
		addTranslatedMessage(CustomMessageId.CHANNER_DISCONNECTED, "来自 %s 的用户连接中断.");
		addTranslatedMessage(CustomMessageId.PLAYER_LOGOUT, "角色ID为: %s 的用户退出聊天频道.");
		addTranslatedMessage(CustomMessageId.GS_DISCONNECTED, "#%s 号游戏服务器连接中断.");
	}
}
