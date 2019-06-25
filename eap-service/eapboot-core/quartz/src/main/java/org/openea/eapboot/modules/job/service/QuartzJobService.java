package org.openea.eapboot.modules.job.service;

import org.openea.eapboot.base.EapBaseService;
import org.openea.eapboot.modules.job.entity.QuartzJob;

import java.util.List;

/**
 * 定时任务接口
 */
public interface QuartzJobService extends EapBaseService<QuartzJob,String> {

    /**
     * 通过类名获取
     * @param jobClassName
     * @return
     */
    List<QuartzJob> findByJobClassName(String jobClassName);
}