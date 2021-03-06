package com.xupt.ttms.model;


public class Studio {
	/* add field
	 * studio_flag   smallint comment    '取值含义：
           0：尚未生成座位，可以根据行列信息生成座位
           1：已经根据影厅的座位信息安排了座位，不能再安排座位；
           -1：影厅损坏或者废弃，不能使用’,
	 */
	private int id=0      ; 
	private String name="" ;
	private int rowCount=0;
	private int colCount=0;
	private String introduction=""; 
	private int studioFlag ;

	
	public int getStudioFlag() {
		return studioFlag;
	}

	public void setStudioFlag(int studioFlag) {
		this.studioFlag = studioFlag;
	}

	public void setID(int ID){
		this.id=ID;
	}
	
	public int getID(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setRowCount(int count){
		this.rowCount=count;
	}
	
	public int getRowCount(){
		return rowCount;
	}
	public void setColCount(int count){
		this.colCount=count;
	}
	
	public int getColCount(){
		return colCount;
	}
	
	public void setIntroduction(String intro){
		this.introduction=intro;
	}
	
	public String getIntroduction(){
		return introduction;
	}	
//	 info.setID(rs.getInt("studio_id"));
//     info.setName(rs.getString("studio_name"));
//     //studio_row_count=?,studio_col_count=?,studio_introduction=?,studio_flag
//     info.setRowCount(rs.getInt("studio_row_count"));
//     info.setColCount(rs.getInt("studio_col_count"));
//     info.setIntroduction(rs.getString("studio_introduction"));
//     info.setStudioFlag(rs.getInt("studio_flag"));
	public String toString(){
		return "{"+"studio_id="+id+"studio_name="+name+"studio_row_count="+rowCount+"studio_col_count="+colCount+"introduction="+introduction+"studioFlag="+studioFlag+"}";
		
	}
	
}
