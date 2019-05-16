package leetcode.¸´Ï°;

public class ×Ö·û´®×ª»»ÕûÊý {
	public static void main(String[] args) {
		String str="+--00000000000000000000000009";
		System.out.print(myAtoi(str));
	}
	public static int myAtoi(String str) {
		int flag=1;
		boolean firstZero=true;
		boolean hasFirst=false;
		StringBuilder buffer=new StringBuilder();
        for(int i=0;i<str.length();i++) {
        	if(buffer.length()==0&&str.charAt(i)==' '&&!hasFirst) {
        		continue;
        	}
        	if(buffer.length()==0&&str.charAt(i)=='-'&&!hasFirst) {
        		hasFirst=true;
        		flag=-1*flag;
        		continue;
        	}
        	if(buffer.length()==0&&str.charAt(i)=='+'&&!hasFirst) {
        		hasFirst=true;
        		continue;
        	}
        	if(str.charAt(i)+0>'9'+0||str.charAt(i)+0<'0'+0) {
        		break;
        	}else {
        		hasFirst=true;
        		if(str.charAt(i)=='0'&&firstZero) {
        			continue;
        		}
        		firstZero=false;
        		buffer.append(str.charAt(i));
        	}
        }
        if(buffer.length()==0) {
        	return 0;
        }else {
        	if(flag==1) {
        		if(buffer.length()>=11) {
            		return flag*Integer.MAX_VALUE;
            	}
            	return flag*(Long.parseLong(buffer.toString())>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)Integer.parseInt(buffer.toString()));
        	}else{
        		if(buffer.length()>=11) {
            		return flag*Integer.MIN_VALUE;
            	}
        		long l=Long.parseLong(buffer.toString());
        		if(l-1>=Integer.MAX_VALUE) {
        			return Integer.MIN_VALUE;
        		}else {
        			return -1*(int)Integer.parseInt(buffer.toString());
        		}
            	
        	}
        }
    }
}
