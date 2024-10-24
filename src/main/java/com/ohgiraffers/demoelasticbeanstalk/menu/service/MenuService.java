package com.ohgiraffers.demoelasticbeanstalk.menu.service;

import com.ohgiraffers.demoelasticbeanstalk.menu.dto.MenuDTO;
import com.ohgiraffers.demoelasticbeanstalk.menu.entity.Menu;
import com.ohgiraffers.demoelasticbeanstalk.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDTO> getAllMenus() {

        List<Menu> menus = menuRepository.findAll();

        List<MenuDTO> menuDTOS = menus.stream().map(MenuDTO::new).collect(Collectors.toList());

        return menuDTOS;
    }

}
