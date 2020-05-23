package com.mooc.sb2.ioc.ann;

import org.springframework.context.annotation.Bean;

public interface SuperConfiguration {

    @Bean
    default MyCat myCat() {
        return new MyCat();
    }

}
