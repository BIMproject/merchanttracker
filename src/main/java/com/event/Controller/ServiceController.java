package com.event.Controller;

	/*import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import com.event.Model.Services;
	import com.event.Service.ServiceService;

	@Controller
	public class ServiceController {
		@Autowired
		private ServiceService ServiceService;

		@RequestMapping("/Service")
		public String setUpForm(Map<String, Object> map) {
			Services Service = new Services();
			map.put("Service", Service);

			return "Service";
		}

		@RequestMapping(value = "/Service.do" , method = RequestMethod.POST)
		public String addPerson(@ModelAttribute("Service") Services Services,
				BindingResult result, Model model) {

			ServiceService.add(Services);

			model.addAttribute("ServiceList", ServiceService.getAllService());
			
			return "ServiceList";

		}

		@RequestMapping("/deleted/{ID}")
		public String remove(@PathVariable("ID") int ID, Model model) {

			ServiceService.delete(ID);
			model.addAttribute("ServiceList", ServiceService.getAllService());
			return "ServiceList";
		}

		@RequestMapping("/just2")
		public String redirect(Model model) {
			model.addAttribute("ServiceList", ServiceService.getAllService());
			return "ServiceList";
		}
		
		@RequestMapping(value={"/1stedit/edit/{ID}"}, method = RequestMethod.POST)
		public String editPerson(@ModelAttribute("Service") Services Services,
				BindingResult result, Model model, @PathVariable("ID") int ID) {
	  		ServiceService.edit(Services);
			model.addAttribute("ServiceList", ServiceService.getAllService());
			return "ServiceList";
		}

		@RequestMapping("/1stedit/{ID}")
		public String edit(@PathVariable("ID") int ID, Model model) {
			model.addAttribute("Service", this.ServiceService.getService(ID));
			model.addAttribute("ServiceList",
					this.ServiceService.getAllService());

			return "editService";

		}

	}


*/