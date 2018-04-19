package cn.com.example.prototype.demo2;

public interface Prototype {
	Object clone();           //浅表复制
	Object cloneDeep();		  //深层复制
}
