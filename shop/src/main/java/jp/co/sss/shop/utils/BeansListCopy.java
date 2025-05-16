package jp.co.sss.shop.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jp.co.sss.shop.bean.ItemBean;
import jp.co.sss.shop.entity.Item;

@Service
public class BeansListCopy {
	public List<ItemBean> copyItemToBean(List<Item> itemsList) {
		List<ItemBean> itemBeansList = new ArrayList<ItemBean>();
		for (Item item : itemsList) {
			ItemBean itemBean = new ItemBean();
			BeanUtils.copyProperties(item, itemBean);
			itemBeansList.add(itemBean);
		}
		return itemBeansList;
	}

}
