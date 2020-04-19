package com.ayana.animalgame;

public class TerminalExpressionAYN implements ExpressionAYN{

	private String data;

	   public TerminalExpressionAYN(String data){
	      this.data = data; 
	   }
	
	@Override
	public boolean interpretAYN(String context) {
		// TODO Auto-generated method stub
		
		if(context.contains(data)){
	         return true;
	      }
	      
		return false;
	}

}
