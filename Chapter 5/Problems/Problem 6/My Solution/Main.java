public class Date
{
	//private int month;
	//private int day;
	private String season;
	String month_error = "This month does not exist";
	String day_error = "This day does not exist";
	String winter = "Winter";
	String fall = "Fall";
	String summer = "Summer";
	String spring = "Spring";
	
	public Date(int month, int day)
	{
		String month_error = "This month does not exist";
		String day_error = "This day does not exist";
		String winter = "Winter";
		String fall = "Fall";
		String summer = "Summer";
		String spring = "Spring";
		
		if (month > 12)//error month
		{
			this.season = month_error;
			return;
		}
		else if (month == 12) //December
		{
			if(day > 31)
			{
			  this.season = day_error;
			  return;
			}
			else if(day >= 21)
			{
			  this.season = winter;
			  return;
			}
			else if(day >= 1)
			{
				this.season = fall;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 11) //November
		{
			if(day > 30)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = fall;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 10) //October
		{
			if(day > 31)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = fall;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 9) //September
		{
			if(day > 30)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 22)
			{
				this.season = fall;
				return;
			}
			else if(day >= 1)
			{
				this.season = summer;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 8) // August 
		{
			if(day > 31)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = summer;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 7) //July
		{
			if(day > 31)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = summer;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 6) //June
		{
			if(day > 30)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 20)
			{
				this.season = summer;
				return;
			}
			else if(day >= 1)
			{
				this.season = spring;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 5) //May
		{
			if(day > 31)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = spring;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 4) //April
		{
			if(day > 30)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = spring;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 3) //March
		{
			if(day > 31)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 19)
			{
				this.season = spring;
				return;
			}
			else if(day >= 1)
			{
				this.season = winter;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 2) //February
		{
			if(day > 29)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = winter;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month == 1) //January
		{
			if(day > 31)
			{
				this.season = day_error;
				return;
			}
			else if(day >= 1)
			{
				this.season = winter;
				return;
			}
			else
			{
				this.season = day_error;
			}
			return;
		}
		else if (month <= 0) //error month
		{
			this.season = month_error;
			return;
		}
	}
	
	public String getSeason()
	{
		return this.season;
	}  
}
