//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<UserExample.Criteria> oredCriteria = new ArrayList();
    private Integer limit;
    private Long offset;

    public UserExample() {
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public List<UserExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(UserExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public UserExample.Criteria or() {
        UserExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public UserExample.Criteria createCriteria() {
        UserExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected UserExample.Criteria createCriteriaInternal() {
        UserExample.Criteria criteria = new UserExample.Criteria();
        return criteria;
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return this.offset;
    }

    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return this.condition;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getSecondValue() {
            return this.secondValue;
        }

        public boolean isNoValue() {
            return this.noValue;
        }

        public boolean isSingleValue() {
            return this.singleValue;
        }

        public boolean isBetweenValue() {
            return this.betweenValue;
        }

        public boolean isListValue() {
            return this.listValue;
        }

        public String getTypeHandler() {
            return this.typeHandler;
        }

        protected Criterion(String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }

        }

        protected Criterion(String condition, Object value) {
            this(condition, value, (String)null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, (String)null);
        }
    }

    public static class Criteria extends UserExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<UserExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<UserExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<UserExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new UserExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new UserExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new UserExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public UserExample.Criteria andUserIdIsNull() {
            this.addCriterion("user_id is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdIsNotNull() {
            this.addCriterion("user_id is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdEqualTo(Integer value) {
            this.addCriterion("user_id =", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdNotEqualTo(Integer value) {
            this.addCriterion("user_id <>", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdGreaterThan(Integer value) {
            this.addCriterion("user_id >", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("user_id >=", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdLessThan(Integer value) {
            this.addCriterion("user_id <", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("user_id <=", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdIn(List<Integer> values) {
            this.addCriterion("user_id in", values, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdNotIn(List<Integer> values) {
            this.addCriterion("user_id not in", values, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id between", value1, value2, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id not between", value1, value2, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameIsNull() {
            this.addCriterion("user_name is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameIsNotNull() {
            this.addCriterion("user_name is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameEqualTo(String value) {
            this.addCriterion("user_name =", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotEqualTo(String value) {
            this.addCriterion("user_name <>", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameGreaterThan(String value) {
            this.addCriterion("user_name >", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameGreaterThanOrEqualTo(String value) {
            this.addCriterion("user_name >=", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameLessThan(String value) {
            this.addCriterion("user_name <", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameLessThanOrEqualTo(String value) {
            this.addCriterion("user_name <=", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameLike(String value) {
            this.addCriterion("user_name like", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotLike(String value) {
            this.addCriterion("user_name not like", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameIn(List<String> values) {
            this.addCriterion("user_name in", values, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotIn(List<String> values) {
            this.addCriterion("user_name not in", values, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameBetween(String value1, String value2) {
            this.addCriterion("user_name between", value1, value2, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotBetween(String value1, String value2) {
            this.addCriterion("user_name not between", value1, value2, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordIsNull() {
            this.addCriterion("`password` is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordIsNotNull() {
            this.addCriterion("`password` is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordEqualTo(String value) {
            this.addCriterion("`password` =", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotEqualTo(String value) {
            this.addCriterion("`password` <>", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordGreaterThan(String value) {
            this.addCriterion("`password` >", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
            this.addCriterion("`password` >=", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordLessThan(String value) {
            this.addCriterion("`password` <", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
            this.addCriterion("`password` <=", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordLike(String value) {
            this.addCriterion("`password` like", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotLike(String value) {
            this.addCriterion("`password` not like", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordIn(List<String> values) {
            this.addCriterion("`password` in", values, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotIn(List<String> values) {
            this.addCriterion("`password` not in", values, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordBetween(String value1, String value2) {
            this.addCriterion("`password` between", value1, value2, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotBetween(String value1, String value2) {
            this.addCriterion("`password` not between", value1, value2, "password");
            return (UserExample.Criteria)this;
        }
    }
}
