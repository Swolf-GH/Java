/**
 * �ַ�����ƴ��
 * @author KK
 *
 */
public class TestStich {
	public static void main(String[] args) {
		// ʹ�� + ��ƴ��
		String str1 = "Hello";
		String str2 = " world";
		String str3 = str1 + str2;   // ��str1��str2ʹ��+��ƴ������
		System.out.println("ʹ��+��ƴ�Ӻ�Ϊ: "+ str3);
		
		//����һ���ַ�����һ�����ַ�����ֵ����ƴ��ʱ�����߱�ת��Ϊ�ַ���
		int num1 = 13;
		String str21 = "Hello"+num1;
		System.out.println("�ַ���������ƴ�Ӻ�Ϊ��"+ str21);
		
		//�����Ҫ������ַ�������һ����һ���綨���ָ����ʹ�þ�̬join����
		String all = String.join("/","S","M","L","XL");
		System.out.println("���Ϊ��"+ all);
		
		
	}
}