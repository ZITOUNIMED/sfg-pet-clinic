package guru.springframework.sfgpetclinic.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
@ComponentScan(
basePackageClasses={},
//basePackages={"com.package1", "com.packge2},
basePackages="com.package1"
)
public class OwnersController {

	@RequestMapping({"", "/index", "/index.html"})
	public String listOwners(){
		return "/owners/index";
	}
}
