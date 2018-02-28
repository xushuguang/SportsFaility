package com.james.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class UserAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAddressExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Long value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Long value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Long value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Long value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Long value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Long value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Long> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Long> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Long value1, Long value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Long value1, Long value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPlotIsNull() {
            addCriterion("plot is null");
            return (Criteria) this;
        }

        public Criteria andPlotIsNotNull() {
            addCriterion("plot is not null");
            return (Criteria) this;
        }

        public Criteria andPlotEqualTo(String value) {
            addCriterion("plot =", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotNotEqualTo(String value) {
            addCriterion("plot <>", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotGreaterThan(String value) {
            addCriterion("plot >", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotGreaterThanOrEqualTo(String value) {
            addCriterion("plot >=", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotLessThan(String value) {
            addCriterion("plot <", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotLessThanOrEqualTo(String value) {
            addCriterion("plot <=", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotLike(String value) {
            addCriterion("plot like", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotNotLike(String value) {
            addCriterion("plot not like", value, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotIn(List<String> values) {
            addCriterion("plot in", values, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotNotIn(List<String> values) {
            addCriterion("plot not in", values, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotBetween(String value1, String value2) {
            addCriterion("plot between", value1, value2, "plot");
            return (Criteria) this;
        }

        public Criteria andPlotNotBetween(String value1, String value2) {
            addCriterion("plot not between", value1, value2, "plot");
            return (Criteria) this;
        }

        public Criteria andBuildnumIsNull() {
            addCriterion("buildnum is null");
            return (Criteria) this;
        }

        public Criteria andBuildnumIsNotNull() {
            addCriterion("buildnum is not null");
            return (Criteria) this;
        }

        public Criteria andBuildnumEqualTo(Long value) {
            addCriterion("buildnum =", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumNotEqualTo(Long value) {
            addCriterion("buildnum <>", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumGreaterThan(Long value) {
            addCriterion("buildnum >", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumGreaterThanOrEqualTo(Long value) {
            addCriterion("buildnum >=", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumLessThan(Long value) {
            addCriterion("buildnum <", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumLessThanOrEqualTo(Long value) {
            addCriterion("buildnum <=", value, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumIn(List<Long> values) {
            addCriterion("buildnum in", values, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumNotIn(List<Long> values) {
            addCriterion("buildnum not in", values, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumBetween(Long value1, Long value2) {
            addCriterion("buildnum between", value1, value2, "buildnum");
            return (Criteria) this;
        }

        public Criteria andBuildnumNotBetween(Long value1, Long value2) {
            addCriterion("buildnum not between", value1, value2, "buildnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumIsNull() {
            addCriterion("unitnum is null");
            return (Criteria) this;
        }

        public Criteria andUnitnumIsNotNull() {
            addCriterion("unitnum is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnumEqualTo(Long value) {
            addCriterion("unitnum =", value, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumNotEqualTo(Long value) {
            addCriterion("unitnum <>", value, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumGreaterThan(Long value) {
            addCriterion("unitnum >", value, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumGreaterThanOrEqualTo(Long value) {
            addCriterion("unitnum >=", value, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumLessThan(Long value) {
            addCriterion("unitnum <", value, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumLessThanOrEqualTo(Long value) {
            addCriterion("unitnum <=", value, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumIn(List<Long> values) {
            addCriterion("unitnum in", values, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumNotIn(List<Long> values) {
            addCriterion("unitnum not in", values, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumBetween(Long value1, Long value2) {
            addCriterion("unitnum between", value1, value2, "unitnum");
            return (Criteria) this;
        }

        public Criteria andUnitnumNotBetween(Long value1, Long value2) {
            addCriterion("unitnum not between", value1, value2, "unitnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("roomnum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomnum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(Long value) {
            addCriterion("roomnum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(Long value) {
            addCriterion("roomnum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(Long value) {
            addCriterion("roomnum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(Long value) {
            addCriterion("roomnum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(Long value) {
            addCriterion("roomnum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(Long value) {
            addCriterion("roomnum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<Long> values) {
            addCriterion("roomnum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<Long> values) {
            addCriterion("roomnum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(Long value1, Long value2) {
            addCriterion("roomnum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(Long value1, Long value2) {
            addCriterion("roomnum not between", value1, value2, "roomnum");
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