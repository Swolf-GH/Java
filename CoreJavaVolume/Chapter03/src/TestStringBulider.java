/**
 * �����ַ���
 * @author kk
 *
 */
public class TestStringBulider {
	public static void main(String[] args) {
		// ���ȹ���һ���յ��ַ���������
		StringBuilder builder = new StringBuilder();
		//����Ҫ���һ��������ʱ���͵���append()����
		builder.append("hel");
		builder.append("lo");
		//��Ҫ�����ַ���ʱ�͵��� tostring �����������Եõ�һ�� Stirng �������а����˹������е��ַ�����
		String completeString = builder.toString();
		//������
		System.out.println(completeString);
	}
}
