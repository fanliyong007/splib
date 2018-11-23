package com.yixing.splib.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andSubnumIsNull() {
            addCriterion("subnum is null");
            return (Criteria) this;
        }

        public Criteria andSubnumIsNotNull() {
            addCriterion("subnum is not null");
            return (Criteria) this;
        }

        public Criteria andSubnumEqualTo(String value) {
            addCriterion("subnum =", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotEqualTo(String value) {
            addCriterion("subnum <>", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumGreaterThan(String value) {
            addCriterion("subnum >", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumGreaterThanOrEqualTo(String value) {
            addCriterion("subnum >=", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLessThan(String value) {
            addCriterion("subnum <", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLessThanOrEqualTo(String value) {
            addCriterion("subnum <=", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLike(String value) {
            addCriterion("subnum like", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotLike(String value) {
            addCriterion("subnum not like", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumIn(List<String> values) {
            addCriterion("subnum in", values, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotIn(List<String> values) {
            addCriterion("subnum not in", values, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumBetween(String value1, String value2) {
            addCriterion("subnum between", value1, value2, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotBetween(String value1, String value2) {
            addCriterion("subnum not between", value1, value2, "subnum");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNull() {
            addCriterion("book_code is null");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNotNull() {
            addCriterion("book_code is not null");
            return (Criteria) this;
        }

        public Criteria andBookCodeEqualTo(Integer value) {
            addCriterion("book_code =", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotEqualTo(Integer value) {
            addCriterion("book_code <>", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThan(Integer value) {
            addCriterion("book_code >", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_code >=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThan(Integer value) {
            addCriterion("book_code <", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThanOrEqualTo(Integer value) {
            addCriterion("book_code <=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeIn(List<Integer> values) {
            addCriterion("book_code in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotIn(List<Integer> values) {
            addCriterion("book_code not in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeBetween(Integer value1, Integer value2) {
            addCriterion("book_code between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("book_code not between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andIslendedIsNull() {
            addCriterion("islended is null");
            return (Criteria) this;
        }

        public Criteria andIslendedIsNotNull() {
            addCriterion("islended is not null");
            return (Criteria) this;
        }

        public Criteria andIslendedEqualTo(Boolean value) {
            addCriterion("islended =", value, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedNotEqualTo(Boolean value) {
            addCriterion("islended <>", value, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedGreaterThan(Boolean value) {
            addCriterion("islended >", value, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("islended >=", value, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedLessThan(Boolean value) {
            addCriterion("islended <", value, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedLessThanOrEqualTo(Boolean value) {
            addCriterion("islended <=", value, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedIn(List<Boolean> values) {
            addCriterion("islended in", values, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedNotIn(List<Boolean> values) {
            addCriterion("islended not in", values, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedBetween(Boolean value1, Boolean value2) {
            addCriterion("islended between", value1, value2, "islended");
            return (Criteria) this;
        }

        public Criteria andIslendedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("islended not between", value1, value2, "islended");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNull() {
            addCriterion("outdate is null");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNotNull() {
            addCriterion("outdate is not null");
            return (Criteria) this;
        }

        public Criteria andOutdateEqualTo(Date value) {
            addCriterion("outdate =", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotEqualTo(Date value) {
            addCriterion("outdate <>", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThan(Date value) {
            addCriterion("outdate >", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThanOrEqualTo(Date value) {
            addCriterion("outdate >=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThan(Date value) {
            addCriterion("outdate <", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThanOrEqualTo(Date value) {
            addCriterion("outdate <=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateIn(List<Date> values) {
            addCriterion("outdate in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotIn(List<Date> values) {
            addCriterion("outdate not in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateBetween(Date value1, Date value2) {
            addCriterion("outdate between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotBetween(Date value1, Date value2) {
            addCriterion("outdate not between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("indate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("indate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Date value) {
            addCriterion("indate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Date value) {
            addCriterion("indate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Date value) {
            addCriterion("indate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("indate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Date value) {
            addCriterion("indate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Date value) {
            addCriterion("indate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Date> values) {
            addCriterion("indate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Date> values) {
            addCriterion("indate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Date value1, Date value2) {
            addCriterion("indate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Date value1, Date value2) {
            addCriterion("indate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIslostIsNull() {
            addCriterion("islost is null");
            return (Criteria) this;
        }

        public Criteria andIslostIsNotNull() {
            addCriterion("islost is not null");
            return (Criteria) this;
        }

        public Criteria andIslostEqualTo(Boolean value) {
            addCriterion("islost =", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostNotEqualTo(Boolean value) {
            addCriterion("islost <>", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostGreaterThan(Boolean value) {
            addCriterion("islost >", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostGreaterThanOrEqualTo(Boolean value) {
            addCriterion("islost >=", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostLessThan(Boolean value) {
            addCriterion("islost <", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostLessThanOrEqualTo(Boolean value) {
            addCriterion("islost <=", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostIn(List<Boolean> values) {
            addCriterion("islost in", values, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostNotIn(List<Boolean> values) {
            addCriterion("islost not in", values, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostBetween(Boolean value1, Boolean value2) {
            addCriterion("islost between", value1, value2, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostNotBetween(Boolean value1, Boolean value2) {
            addCriterion("islost not between", value1, value2, "islost");
            return (Criteria) this;
        }

        public Criteria andLostdateIsNull() {
            addCriterion("lostdate is null");
            return (Criteria) this;
        }

        public Criteria andLostdateIsNotNull() {
            addCriterion("lostdate is not null");
            return (Criteria) this;
        }

        public Criteria andLostdateEqualTo(Date value) {
            addCriterion("lostdate =", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateNotEqualTo(Date value) {
            addCriterion("lostdate <>", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateGreaterThan(Date value) {
            addCriterion("lostdate >", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lostdate >=", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateLessThan(Date value) {
            addCriterion("lostdate <", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateLessThanOrEqualTo(Date value) {
            addCriterion("lostdate <=", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateIn(List<Date> values) {
            addCriterion("lostdate in", values, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateNotIn(List<Date> values) {
            addCriterion("lostdate not in", values, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateBetween(Date value1, Date value2) {
            addCriterion("lostdate between", value1, value2, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateNotBetween(Date value1, Date value2) {
            addCriterion("lostdate not between", value1, value2, "lostdate");
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