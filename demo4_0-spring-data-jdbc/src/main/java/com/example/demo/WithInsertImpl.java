package com.example.demo;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;

public class WithInsertImpl<T extends FourFinanceClient> implements WithInsert<T> {

    private final JdbcAggregateTemplate template;

    public WithInsertImpl(JdbcAggregateTemplate template) {
        this.template = template;
    }

    @Override
    public T insert(T t) {
        t.addPrefix("4finance-");
        return template.insert(t);
    }

}
