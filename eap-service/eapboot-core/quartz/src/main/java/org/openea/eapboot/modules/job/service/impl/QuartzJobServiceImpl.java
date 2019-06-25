package org.openea.eapboot.modules.job.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.openea.eapboot.modules.job.dao.QuartzJobDao;
import org.openea.eapboot.modules.job.entity.QuartzJob;
import org.openea.eapboot.modules.job.service.QuartzJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 定时任务接口实现
 */
@Slf4j
@Service
@Transactional
public class QuartzJobServiceImpl implements QuartzJobService {

    @Autowired
    private QuartzJobDao quartzJobDao;

    @Override
    public QuartzJobDao getRepository() {
        return quartzJobDao;
    }

    @Override
    public List<QuartzJob> findByJobClassName(String jobClassName) {

        return quartzJobDao.findByJobClassName(jobClassName);
    }
}