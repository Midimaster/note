package com.note.miaosha.redis;

public class OrderKey extends com.imooc.miaosha.redis.BasePrefix {

	public OrderKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}

}
