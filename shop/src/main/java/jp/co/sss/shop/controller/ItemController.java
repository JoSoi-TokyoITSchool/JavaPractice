package jp.co.sss.shop.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.shop.bean.ItemBean;
import jp.co.sss.shop.entity.Item;
import jp.co.sss.shop.form.ItemForm;
import jp.co.sss.shop.repository.ItemRepository;
import jp.co.sss.shop.utils.BeansListCopy;

@Controller
public class ItemController {

	@Autowired
	ItemRepository repository;
	BeansListCopy listCopy;

	@RequestMapping("/items/findAll")
	public String showItemList(Model model) {
		//データベースから取得した全てのアイテム情報を「items」というキーで
		//Modelに保存し、HTMLテンプレート（ビュー）に渡す。
		model.addAttribute("items", repository.findAll());
		return "items/item_list";
	}

	@RequestMapping("/items/findAllByOrderByPriceDesc")
	public String showItemListByOrderByPriceDesc(Model model) {
		model.addAttribute("items", repository.findAllByOrderByPriceDesc());
		return "items/item_list";
	}

	@RequestMapping("/items/getReferenceById/{id}")
	public String showItem(@PathVariable int id, Model model) {
		Item item = repository.getReferenceById(id);
		ItemBean itemBean = new ItemBean();
		itemBean.setId(item.getId());
		itemBean.setName(item.getName());
		itemBean.setPrice(item.getPrice());
		model.addAttribute("item", itemBean);
		return "items/item";
	}

	@RequestMapping("/items/findByPrice/{price}")
	public String showItemListByPrice(@PathVariable Integer price, Model model) {
		model.addAttribute("items", repository.findByPrice(price));
		return "items/item_list";
	}

	@RequestMapping("/items/findAllAndSetDropdown")
	public String itemListSetDropdown(Model model) {
		model.addAttribute("items", repository.findAll());
		return "items/item_list_dropdown";
	}

	@RequestMapping("/items/create/input")
	public String createInput() {
		return "items/create_input";
	}

	@RequestMapping(path = "/items/create/complete", method = RequestMethod.POST)
	public String createComplete(ItemForm form, Model model) {
		Item item = new Item();
		BeanUtils.copyProperties(form, item, "id");
		item = repository.save(item);
		ItemBean itemBean = new ItemBean();
		BeanUtils.copyProperties(item, itemBean);
		model.addAttribute("item", itemBean);
		return "items/item";
	}

}
