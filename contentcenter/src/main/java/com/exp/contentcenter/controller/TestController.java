package com.exp.contentcenter.controller;

import com.exp.contentcenter.dao.content.ShareMapper;
import com.exp.contentcenter.domain.entity.content.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ShareMapper shareMapper;

    @GetMapping("/share")
    public List<Share> testInsert(){
        Share share = new Share();
        share.setCreateTime(new Date());
        share.setUpdateTime(new Date());
        share.setTitle("XXX");
        share.setCover("XXX");
        share.setAuthor("Chensy");
        share.setBuyCount(1);
        this.shareMapper.insertSelective(share);

        List<Share> shares = this.shareMapper.selectAll();

        return shares;
    }
}
