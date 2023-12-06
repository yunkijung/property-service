package com.loglrs.propertyservice.config;


import com.loglrs.propertyservice.domain.offer_h.entity.OfferH;
import com.loglrs.propertyservice.domain.offer_h.repository.OfferHRepository;
import com.loglrs.propertyservice.domain.offer_r.entity.OfferR;
import com.loglrs.propertyservice.domain.offer_r.repository.OfferRRepository;
import com.loglrs.propertyservice.domain.rule_h.entity.RuleH;
import com.loglrs.propertyservice.domain.rule_h.repository.RuleHRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(
            RuleHRepository ruleHRepository
            , OfferHRepository offerHRepository
            , OfferRRepository offerRRepository
    ) {
        return args -> {


            if(ruleHRepository.count() == 0) {
                RuleH ruleH1 = new RuleH("ruleH1", "Please, Make less noisy after 10pm.");
                RuleH ruleH2 = new RuleH("ruleH2", "Extra costs for car parking ( Apartment )");
                RuleH ruleH3 = new RuleH("ruleH3", "2 weeks notice, please.");
                RuleH ruleH4 = new RuleH("ruleH4", "No entry for heavy smoker.");
                RuleH ruleH5 = new RuleH("ruleH5", "Sorry. No allowed Pets.");
                RuleH ruleH6 = new RuleH("ruleH6", "Must be wash the stuff after using.");
                ruleHRepository.save(ruleH1);
                ruleHRepository.save(ruleH2);
                ruleHRepository.save(ruleH3);
                ruleHRepository.save(ruleH4);
                ruleHRepository.save(ruleH5);
                ruleHRepository.save(ruleH6);
            }
            if(offerHRepository.count() == 0) {
                OfferH offerH1 = new OfferH("offerH1", "Wi-Fi");
                OfferH offerH2 = new OfferH("offerH2", "Free parking");
                OfferH offerH3 = new OfferH("offerH3", "swimming pool");
                OfferH offerH4 = new OfferH("offerH4", "TV");
                OfferH offerH5 = new OfferH("offerH5", "smoke alarm");
                OfferH offerH6 = new OfferH("offerH6", "Refrigerator");
                OfferH offerH7 = new OfferH("offerH7", "Balcony");
                OfferH offerH8 = new OfferH("offerH8", "Air conditioner");
                OfferH offerH9 = new OfferH("offerH9", "Washing machine");
                OfferH offerH10 = new OfferH("offerH10", "Gym");
                OfferH offerH11 = new OfferH("offerH11", "Heater");
                OfferH offerH12 = new OfferH("offerH12", "dryer");
                offerHRepository.save(offerH1);
                offerHRepository.save(offerH2);
                offerHRepository.save(offerH3);
                offerHRepository.save(offerH4);
                offerHRepository.save(offerH5);
                offerHRepository.save(offerH6);
                offerHRepository.save(offerH7);
                offerHRepository.save(offerH8);
                offerHRepository.save(offerH9);
                offerHRepository.save(offerH10);
                offerHRepository.save(offerH11);
                offerHRepository.save(offerH12);

            }
            if (offerRRepository.count() == 0) {
                OfferR offerR1 = new OfferR("offerR1", "Bed");
                OfferR offerR2 = new OfferR("offerR2", "Closet");
                OfferR offerR3 = new OfferR("offerR3", "Desk");
                OfferR offerR4 = new OfferR("offerR4", "Chair");
                OfferR offerR5 = new OfferR("offerR5", "Window");
                OfferR offerR6 = new OfferR("offerR6", "Lamp");
                OfferR offerR7 = new OfferR("offerR7", "Air conditioner");
                OfferR offerR8 = new OfferR("offerR8", "Washroom");
                OfferR offerR9 = new OfferR("offerR9", "Quilt");
                OfferR offerR10 = new OfferR("offerR10", "Pillow");
                offerRRepository.save(offerR1);
                offerRRepository.save(offerR2);
                offerRRepository.save(offerR3);
                offerRRepository.save(offerR4);
                offerRRepository.save(offerR5);
                offerRRepository.save(offerR6);
                offerRRepository.save(offerR7);
                offerRRepository.save(offerR8);
                offerRRepository.save(offerR9);
                offerRRepository.save(offerR10);
            }


        };
    }
}
