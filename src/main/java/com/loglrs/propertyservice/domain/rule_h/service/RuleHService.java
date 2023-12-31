package com.loglrs.propertyservice.domain.rule_h.service;

import com.loglrs.propertyservice.domain.rule_h.entity.RuleH;
import com.loglrs.propertyservice.domain.rule_h.repository.RuleHRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RuleHService {
    private final RuleHRepository ruleHRepository;

    @Transactional
    public List<RuleH> findAllByIdIn(List<Long> ids) {
        return ruleHRepository.findAllByIdIn(ids);
    }

    @Transactional
    public List<RuleH> findAll() {
        return ruleHRepository.findAll();
    }
}
