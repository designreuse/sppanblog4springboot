package net.sppan.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import net.sppan.blog.dao.OptionsRepository;
import net.sppan.blog.entity.Options;
import net.sppan.blog.service.OptionsService;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class OptionsServiceImpl implements OptionsService{
	
	@Resource
	private OptionsRepository optionsRepository;

	@Override
	public List<Options> findAll() {
		return optionsRepository.findAll();
	}

}
