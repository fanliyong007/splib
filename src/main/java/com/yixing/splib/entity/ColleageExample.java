package com.yixing.splib.entity;

import java.util.ArrayList;
import java.util.List;

public class ColleageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColleageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andColleageIdIsNull() {
            addCriterion("colleage_id is null");
            return (Criteria) this;
        }

        public Criteria andColleageIdIsNotNull() {
            addCriterion("colleage_id is not null");
            return (Criteria) this;
        }

        public Criteria andColleageIdEqualTo(String value) {
            addCriterion("colleage_id =", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotEqualTo(String value) {
            addCriterion("colleage_id <>", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdGreaterThan(String value) {
            addCriterion("colleage_id >", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdGreaterThanOrEqualTo(String value) {
            addCriterion("colleage_id >=", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdLessThan(String value) {
            addCriterion("colleage_id <", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdLessThanOrEqualTo(String value) {
            addCriterion("colleage_id <=", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdLike(String value) {
            addCriterion("colleage_id like", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotLike(String value) {
            addCriterion("colleage_id not like", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdIn(List<String> values) {
            addCriterion("colleage_id in", values, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotIn(List<String> values) {
            addCriterion("colleage_id not in", values, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdBetween(String value1, String value2) {
            addCriterion("colleage_id between", value1, value2, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotBetween(String value1, String value2) {
            addCriterion("colleage_id not between", value1, value2, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageNameIsNull() {
            addCriterion("colleage_name is null");
            return (Criteria) this;
        }

        public Criteria andColleageNameIsNotNull() {
            addCriterion("colleage_name is not null");
            return (Criteria) this;
        }

        public Criteria andColleageNameEqualTo(String value) {
            addCriterion("colleage_name =", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameNotEqualTo(String value) {
            addCriterion("colleage_name <>", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameGreaterThan(String value) {
            addCriterion("colleage_name >", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameGreaterThanOrEqualTo(String value) {
            addCriterion("colleage_name >=", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameLessThan(String value) {
            addCriterion("colleage_name <", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameLessThanOrEqualTo(String value) {
            addCriterion("colleage_name <=", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameLike(String value) {
            addCriterion("colleage_name like", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameNotLike(String value) {
            addCriterion("colleage_name not like", value, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameIn(List<String> values) {
            addCriterion("colleage_name in", values, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameNotIn(List<String> values) {
            addCriterion("colleage_name not in", values, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameBetween(String value1, String value2) {
            addCriterion("colleage_name between", value1, value2, "colleageName");
            return (Criteria) this;
        }

        public Criteria andColleageNameNotBetween(String value1, String value2) {
            addCriterion("colleage_name not between", value1, value2, "colleageName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
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
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}