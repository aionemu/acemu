package languages;

import com.aionemu.commons.utils.i18n.CustomMessageId;
import com.aionemu.commons.utils.i18n.Language;

public class China extends Language {

	public China() {
		super("CN");
		addSupportedLanguage("cn_CN");
		addTranslatedMessage(CustomMessageId.LOADING, "����: %s");
		addTranslatedMessage(CustomMessageId.NO_PROPERTIES, "δ�ҵ������ļ�");
		addTranslatedMessage(CustomMessageId.CANT_LOAD, "�޷����������ļ�: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO, "+----");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO1, "| �������ڴ�����ʱ�� %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO2, "|    |");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO3, "| �ڴ�����: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO4, "|    |= �����ڴ�: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO5, "|    |= �����ڴ�: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO6, "| �����ڴ�: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO7, "|    |= �����ڴ�: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO8, "|    |= δ���ڴ�: %s");
		addTranslatedMessage(CustomMessageId.MEMORY_INFO9, "| �����ڴ�: %s");
		addTranslatedMessage(CustomMessageId.CPU, "����������: %s");
		addTranslatedMessage(CustomMessageId.CPU1, "��������ʶ: %s");
		addTranslatedMessage(CustomMessageId.OS, "����ϵͳ: %s �汾: %s");
		addTranslatedMessage(CustomMessageId.OS1, "������: %s");
		addTranslatedMessage(CustomMessageId.JAVA, "JAVA ƽ̨��Ϣ");
		addTranslatedMessage(CustomMessageId.JAVA1, "JAVA ��������: %s");
		addTranslatedMessage(CustomMessageId.JAVA2, "JAVA ��    ��: %s");
		addTranslatedMessage(CustomMessageId.JAVA3, "JAVA �� �� ��: %s");
		addTranslatedMessage(CustomMessageId.JVM, "�������Ϣ(JVM)");
		addTranslatedMessage(CustomMessageId.JVM1, "��    ��: %s");
		addTranslatedMessage(CustomMessageId.JVM2, "��װ·��: %s");
		addTranslatedMessage(CustomMessageId.JVM3, "��    ��: %s");
		addTranslatedMessage(CustomMessageId.JVM4, "���й�˾: %s");
		addTranslatedMessage(CustomMessageId.JVM5, "��    Ϣ: %s");
		addTranslatedMessage(CustomMessageId.NIOSERVERALL, "���Ŷ˿� %s �ȴ�%s");
		addTranslatedMessage(CustomMessageId.NIOSERVER, "���Ŷ˿� %s �ȴ����� %s ��%s");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS, "��Ϸ����������.");
		addTranslatedMessage(CustomMessageId.CHAT_STARTED, "���������������ʱ %s ��.");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS1, "�յ����� %s ����Ϸ����������.");
		addTranslatedMessage(CustomMessageId.GS_CONNECTIONS2, "#%s ����Ϸ���������ӳɹ�.");
		addTranslatedMessage(CustomMessageId.CLIENT_CONNECTIONS, "�յ����� %s �Ŀͻ�������.");
		addTranslatedMessage(CustomMessageId.CLIENT_HACK, "��ɫ���쳣��ע���ɫ��: %s ʵ�ʽ�ɫ��: %s.");
		addTranslatedMessage(CustomMessageId.CHANNER_DISCONNECTED, "���� %s ���û������ж�.");
		addTranslatedMessage(CustomMessageId.PLAYER_LOGOUT, "��ɫIDΪ: %s ���û��˳�����Ƶ��.");
		addTranslatedMessage(CustomMessageId.GS_DISCONNECTED, "#%s ����Ϸ�����������ж�.");
	}
}