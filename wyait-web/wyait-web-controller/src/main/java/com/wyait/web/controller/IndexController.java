package com.wyait.web.controller;

import java.io.IOException;

import com.wyait.common.tools.HttpService;
import com.wyait.common.tools.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * @项目名称：wyait-web
 * @包名：com.wyait.web.controller
 * @类描述：
 * @创建人：wyait
 * @创建时间：2018-06-19 14:32
 * @version：V1.0
 */
@Controller
@RequestMapping
public class IndexController {

		private final static Logger LOGGER = LoggerFactory
				.getLogger(IndexController.class);

		@Autowired
		private RedisUtil redisUtil;
		@Autowired
		private HttpService httpService;

		@RequestMapping(value = "/{page}")
		public ModelAndView toPage(@PathVariable("page") String page) {
			LOGGER.debug("===================page:" + page);
			LOGGER.info("===================page:" + page);
			LOGGER.error("===================page:" + page);
			//common工具类使用
			return new ModelAndView(page);
		}

		@RequestMapping(value = "index")
		public ModelAndView toIndex() {
			ModelAndView mv = new ModelAndView("index");
			this.redisUtil.set("aaa", "test");
			String aaa = (String) this.redisUtil.get("aaa");
			try {
				this.httpService.doDelete("aaa");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LOGGER.debug("================aaa:" + aaa);
			LOGGER.info("===================mv:" + mv);
			return mv;
		}


}
