package com.skingz.designpattern.struct.flyweight;

public abstract class Flyweight {
	//�ڲ�״̬
	private String intrinsic;
	//�ⲿ״̬
	protected final String Extrinsic;
	//Ҫ����Ԫ��ɫ��������ⲿ״̬
	public Flyweight(String _Extrinsic){
		this.Extrinsic = _Extrinsic;
	}
	//����ҵ�����
	public abstract void operate();
	//�ڲ�״̬��getter/setter
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}
