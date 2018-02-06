package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import Bean.Emp;
import Dao.EmpDao;

@Controller
public class EmpController 
{
	 @Autowired
	 EmpDao dao;
	 
	@RequestMapping("/empform")	
    public String  showform(Model model)
	{  
		Emp emp=new Emp();
		model.addAttribute("command", emp);
        return "empform";  
    }  
	
	@RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") Emp emp){  
        dao.save(emp);  
        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
    }  
	
	/*@RequestMapping("/empform")  
    public ModelAndView showform()
	{  
        return new ModelAndView("empform","command",new Emp());  
    }  
*/
}
