/**
 *  Copyright 2008-2010 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.tuo.core.area.entity;

/**
 * <p>
 * Title: FgwXmsbkCondition
 * </p>
 * <p>
 * Description: 行政区划管理查询条件实体类
 * </p>
 * <p>
 * tuo
 * </p>
 * <p>
 * Copyright (c) 2007
 * </p>
 * 
 * @Date 2015-03-18 22:40:50
 * @author liy
 * @version v1.0
 */
public class FgwXmsbkCondition implements java.io.Serializable {
	private String xmgkdw;
	private String jsdz;
	private String sortKey;
	private boolean sortDesc;

	public FgwXmsbkCondition() {
	}

	public void setXmgkdw(String xmgkdw) {
		this.xmgkdw = xmgkdw;
	}

	public String getXmgkdw() {
		return xmgkdw;
	}

	public void setJsdz(String jsdz) {
		this.jsdz = jsdz;
	}

	public String getJsdz() {
		return jsdz;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public String getSortKey() {
		return sortKey;
	}

	public void setSortDesc(boolean sortDesc) {
		this.sortDesc = sortDesc;
	}

	public boolean getSortDesc() {
		return sortDesc;
	}
}