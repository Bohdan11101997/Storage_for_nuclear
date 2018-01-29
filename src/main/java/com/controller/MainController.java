package com.controller;

import com.Entity.*;
import com.Service.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class MainController {
final  static Logger logger = Logger.getLogger(MainController.class);

    //BRV
    private BrvService brvService;

    @Autowired
    public void setBrvService(BrvService brvService) {
        this.brvService = brvService;
    }

    //TRV
    private TrvService trvService;

    @Autowired
    public void setTrvService(TrvService trvService) {
        this.trvService = trvService;
    }


//DIV
    private DivService divService;



    @Autowired
    public void setDivService(DivService divService) {
        this.divService = divService;
    }

    //Nuclide list

    private Nuclide_listService nuclide_listService;


    @Autowired
    public void setNuclide_listService(Nuclide_listService nuclide_listService) {
        this.nuclide_listService = nuclide_listService;
    }

    //RRV
    private RrvService rrvService;


    @Autowired
    public void setRrvService(RrvService rrvService) {
        this.rrvService = rrvService;
    }

//Storage
    private  StorageService storageService;

    @Autowired
    public void setStorageService(StorageService storageService) {
        this.storageService = storageService;
    }


    //Group_by_power
    private  Group_By_powerService group_by_powerService;


    @Autowired
    public void setGroup_by_powerService(Group_By_powerService group_by_powerService) {
        this.group_by_powerService = group_by_powerService;
    }



//Category
    private CategoryService categoryService;

   @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
//Type_div

   private   Type_divService type_divService;

   @Autowired
    public void setType_divService(Type_divService type_divService) {
        this.type_divService = type_divService;
    }

    //    @Autowired
//    private Storages storages;                   make another time

    @RequestMapping(value = "/dovidka")
    public String dovidka()
    {
        logger.info("Dovidka");
        return "chemicalEL";
    }


    @RequestMapping(value = "/report")
    public String report(Model model)
    {
        model.addAttribute("All_Activity_BRVS", this.nuclide_listService.All_Activity_BRVS());
        model.addAttribute("All_Amount_BRVS", this.nuclide_listService.All_Amount_BRVS());
        model.addAttribute("All_Amount_TRVS", this.nuclide_listService.All_Amount_TRVS());
        model.addAttribute("All_Activity_TRVS", this.nuclide_listService.All_Activity_TRVS());
        model.addAttribute("All_Amount_DIVS", this.nuclide_listService.All_Amount_DIVS());
        model.addAttribute("All_Activity_DIVS", this.nuclide_listService.All_Activity_DIVS());
        model.addAttribute("All_Amount_RRVS", this.nuclide_listService.All_Amount_RRVS());
        model.addAttribute("All_Activity_RRVS", this.nuclide_listService.All_Activity_RRVS());
        model.addAttribute("AllStorages", this.storageService.getAll());


        model.addAttribute("AllDivs", this.divService.getAll());
        model.addAttribute("AllTrvs", this.trvService.getAll());
        model.addAttribute("AllBrvs", this.brvService.getAll());
        model.addAttribute("AllRrvs", this.rrvService.getAll());
        return "report";
    }


//BrvController
   @RequestMapping(value = "/brvs", method = RequestMethod.GET)
    public String listBrvs( Model model) {
        model.addAttribute("AllBrvs", this.brvService.getAll());
       model.addAttribute("All_Activity_BRVS", this.nuclide_listService.All_Activity_BRVS());
       model.addAttribute("All_Amount_BRVS", this.nuclide_listService.All_Amount_BRVS());
        return "brv";
    }

    @RequestMapping(value = "/sortGroupByPower", method = RequestMethod.GET)
    public String SortBrvsGroup_by_power( Model model) {
        model.addAttribute("AllBrvs", this.brvService.OrderbyGroup_by_power());
        model.addAttribute("All_Activity_BRVS", this.nuclide_listService.All_Activity_BRVS());
        model.addAttribute("All_Amount_BRVS", this.nuclide_listService.All_Amount_BRVS());
        return "brv";
    }


    @RequestMapping(value = "/sortDateBrvs", method = RequestMethod.GET)
    public String SortBrvsDate( Model model) {
        model.addAttribute("AllBrvs", this.brvService.OrderbyData());
        model.addAttribute("All_Activity_BRVS", this.nuclide_listService.All_Activity_BRVS());
        model.addAttribute("All_Amount_BRVS", this.nuclide_listService.All_Amount_BRVS());
        return "brv";
    }

    @RequestMapping("/brvNEW")
    public String newBrv( Model model){
        model.addAttribute("brv", new BRV());
        return "newItemBrv";
    }

    @RequestMapping(value = "/brvsave", method = RequestMethod.POST)
    public String saveBrv(@ModelAttribute("brv") BrvResource brvResource ){
        BRV brv =new BRV(
                (long) brvResource.getBRV_id(),
                brvResource.getStorage_start_date(),
                brvResource.getNotes_BRV(),
                nuclide_listService.getByID(Integer.valueOf(brvResource.getNuclide_list())),
                group_by_powerService.getByID(String.valueOf(brvResource.getGroup_by_power())),
                storageService.getById(Integer.valueOf(brvResource.getStorage_id()))
        );
       this.brvService.SaveBrv(brv);
       logger.info("BRV was saved");

        return "redirect:/brvs";
    }

    @RequestMapping("/brv/edit/{id}")
    public String editBrv(@PathVariable("id") Long id, Model model){
        model.addAttribute("brv", this.brvService.getById(id));
        return "newItemBrv";
    }

    @RequestMapping("brv/{id}")
    public String showBrvs(@PathVariable Long id, Model model){
        model.addAttribute("brv", brvService.getById(id));
        return "brvShow";
    }

    @RequestMapping(value = "/brv/delete/{id}")
    public String deleteBrvs(@PathVariable Long id){
        brvService.delete(id);
        return "redirect:/brvs";
    }


    //TrvController
    @RequestMapping(value = "/trvs", method = RequestMethod.GET)
    public String listTrvs( Model model) {
        model.addAttribute("AllTrvs", this.trvService.getAll());
        model.addAttribute("All_Amount_TRVS", this.nuclide_listService.All_Amount_TRVS());
        model.addAttribute("All_Activity_TRVS", this.nuclide_listService.All_Activity_TRVS());
        return "trv";
    }


    @RequestMapping("/trvNEW")
    public String newTrv(@ModelAttribute("trv") TrvResource trvResource){
        TRV trv = new TRV(
                (long) trvResource.getTRV_id(),
                trvResource.getStorage_start_date(),
                trvResource.getNotes(),
                storageService.getById(Integer.valueOf(trvResource.getStorage_id())),
                nuclide_listService.getByID(Integer.valueOf(trvResource.getNuclide_list())),
                group_by_powerService.getByID(String.valueOf(trvResource.getGroup_by_power()))
        );
        trvService.SaveTRV(trv);
logger.info("TRV was saved");
        return "newItemTrv";
    }
    @RequestMapping(value = "/trvsave", method = RequestMethod.POST)
    public String saveTrv(TRV trv){
        trvService.SaveTRV(trv);
        return "redirect:/trvs";
    }

    @RequestMapping("trv/delete/{id}")
    public String deleteTrvs(@PathVariable Long id){
        trvService.delete(id);
        return "redirect:/trvs";
    }

    @RequestMapping("trv/{id}")
    public String showTrvs(@PathVariable Long id, Model model){
        model.addAttribute("trv", trvService.getById(id));
        return "trvShow";
    }

    @RequestMapping("/trv/edit/{id}")
    public String editTrv(@PathVariable("id") Long id, Model model){
        model.addAttribute("trv", this.trvService.getById(id));
        return "newItemTrv";
    }
    @RequestMapping(value = "/OrderbyData_StorageTRV", method = RequestMethod.GET)
    public String OrderbyData_StorageTRV ( Model model) {
        model.addAttribute("AllTrvs", this.trvService.OrderbyData_StorageTRV());
        model.addAttribute("All_Activity_TRVS", this.nuclide_listService.All_Activity_TRVS());
        model.addAttribute("All_Amount_TRVS", this.nuclide_listService.All_Amount_TRVS());
        return "trv";
    }


    @RequestMapping(value = "/OrderbyGroupTRV", method = RequestMethod.GET)
    public String OrderbyGroupTRV( Model model) {
        model.addAttribute("AllTrvs", this.trvService.findAllByGroup_by_powerTRV());
        model.addAttribute("All_Activity_TRVS", this.nuclide_listService.All_Activity_TRVS());
        model.addAttribute("All_Amount_TRVS", this.nuclide_listService.All_Amount_TRVS());
        return "trv";
    }

    //DivController
    @RequestMapping(value = "/divs", method = RequestMethod.GET)
    public String listDivs( Model model) {
        model.addAttribute("AllDivs", this.divService.getAll());
        model.addAttribute("All_Amount_DIVS", this.nuclide_listService.All_Amount_DIVS());
        model.addAttribute("All_Activity_DIVS", this.nuclide_listService.All_Activity_DIVS());
        logger.info("GET DIV list");
        return "div";
    }

    @RequestMapping(value = "/divNEW", method = RequestMethod.GET)
    public String newDiv(@ModelAttribute("div") DivResource divResource ){
        Div div = new Div(
                (long)    divResource.getDiv_id(),
                divResource.getDate_of_create(),
                divResource.getName_device(),
                divResource.getDate_of_create_storage(),
                divResource.getNotes(),
                storageService.getById(Integer.valueOf(divResource.getStorage_id())),
                type_divService.getById(String.valueOf(divResource.getType_div())),
                nuclide_listService.getByID(Integer.valueOf(divResource.getNuclide_list()))
        );
        divService.saveDiv(div);
        logger.info("Create new DIV");
        return "newItemDiv";
    }

    @RequestMapping(value = "/divsave", method = RequestMethod.POST)
    public String saveDiv(Div div){
        divService.saveDiv(div);
        logger.info("DIV  save");
        return "redirect:/divs";
    }

    @RequestMapping("/div/edit/{id}")
    public String editDiv(@PathVariable("id") Long id, Model model){
        model.addAttribute("div", this.divService.getById(id));

        return "newItemDiv";
    }

    @RequestMapping("div/delete/{id}")
    public String deleteDiv(@PathVariable Long id) {
        divService.delete(id);
        return "redirect:/divs";
    }

    @RequestMapping("div/{id}")
    public String showDiv(@PathVariable Long id, Model model){
        model.addAttribute("div", divService.getById(id));
        return "divShow";
    }
    @RequestMapping(value = "/OrderbyData_Storage", method = RequestMethod.GET)
    public String OrderbyData_Storage ( Model model) {
        model.addAttribute("AllDivs", this.divService.OrderbyData_Storage());
        model.addAttribute("All_Activity_DIVS", this.nuclide_listService.All_Activity_DIVS());
        model.addAttribute("All_Amount_DIVS", this.nuclide_listService.All_Amount_DIVS());
        return "div";
    }


    @RequestMapping(value = "/OrderbyData_Create", method = RequestMethod.GET)
    public String OrderbyData_Create( Model model) {
        model.addAttribute("AllDivs", this.divService.OrderbyData_Create());
        model.addAttribute("All_Activity_DIVS", this.nuclide_listService.All_Activity_DIVS());
        model.addAttribute("All_Amount_DIVS", this.nuclide_listService.All_Amount_DIVS());
        return "div";
    }


    //StorageController
    @RequestMapping(value = "/storage", method = RequestMethod.GET)
    public String listStorages( Model model) {
        model.addAttribute("AllStorages", this.storageService.getAll());
        return "storage";
    }

    @RequestMapping(value = "/FindStorageByName", method = RequestMethod.POST)
    public String findBySearchTerm(@RequestParam String name, Model model) {
        model.addAttribute( "AllStorages" ,this.storageService.FindStorageByName(name));
        return "storage";
    }

    @RequestMapping(value = "/OrderByCapacity", method = RequestMethod.GET)
    public String OrderByCapacity( Model model) {
        model.addAttribute("AllStorages", this.storageService.OrderByCapacity());
        return "storage";
    }

    @RequestMapping(value = "/storageNEW", method = RequestMethod.GET)
    public String newStorage(Model model){
        model.addAttribute("storage", new Storage());
        return "newItemStorage";
    }

    @RequestMapping(value = "/storagesave", method = RequestMethod.POST)
    public String saveStorage(Storage storage){
        storageService.SaveStorage(storage);
        return "redirect:/storage";
    }

    @RequestMapping("storage/edit/{id}")
    public String editStorage(@PathVariable("id") Integer id, Model model){
        model.addAttribute("storage", this.storageService.getById(id));
        System.out.println("BRV"+this.nuclide_listService.All_Activity_Storage_BRV(storageService.getById(id)));
        System.out.println("TRV"+this.nuclide_listService.All_Activity_Storage_TRV(storageService.getById(id)));
        System.out.println("RRV"+this.nuclide_listService.All_Activity_Storage_RRV(storageService.getById(id)));
        System.out.println("DIV"+this.nuclide_listService.All_Activity_Storage_DIV(storageService.getById(id)));
        System.out.println("Sum"+this.nuclide_listService.All_Activity_Storage_BRV(storageService.getById(id))+this.nuclide_listService.All_Activity_Storage_TRV(storageService.getById(id))+this.nuclide_listService.All_Activity_Storage_RRV(storageService.getById(id))+this.nuclide_listService.All_Activity_Storage_DIV(storageService.getById(id)));
        System.out.println("BRV"+this.nuclide_listService.All_Amount_Storage_BRV(storageService.getById(id)));
        System.out.println("TRV"+this.nuclide_listService.All_Amount_Storage_TRV(storageService.getById(id)));
        System.out.println("RRV"+this.nuclide_listService.All_Amount_Storage_RRV(storageService.getById(id)));
        System.out.println("DIV"+this.nuclide_listService.All_Amount_Storage_DIV(storageService.getById(id)));
       // model.addAttribute("SumAmount1",this.nuclide_listService.All_Amount_Storage_BRV(storageService.getById(1))+this.nuclide_listService.All_Amount_Storage_TRV(storageService.getById(1)) +this.nuclide_listService.All_Amount_Storage_RRV(storageService.getById(1))+this.nuclide_listService.All_Amount_Storage_DIV(storageService.getById(1)));
        return "newItemStorage";
    }

    @RequestMapping("storage/delete/{id}")
    public String deleteStorage(@PathVariable Integer id) {
        storageService.delete(id);
        return "redirect:/storage";
    }

    @RequestMapping("storage/{id}")
    public String showStorage(@PathVariable Integer id, Model model){
        model.addAttribute("storage ", storageService.getById(id));
        return "storageShow";
    }

    //RrvController
    @RequestMapping(value = "/rrvs", method = RequestMethod.GET)
    public String listRrvs( Model model) {
        model.addAttribute("AllRrvs", this.rrvService.getAll());
        model.addAttribute("All_Amount_RRVS", this.nuclide_listService.All_Amount_RRVS());
        model.addAttribute("All_Activity_RRVS", this.nuclide_listService.All_Activity_RRVS());
        return "rrv";
    }

    @RequestMapping(value = "/rrvNEW", method = RequestMethod.GET)
    public String newRrv(@ModelAttribute("rrv") RrvResourse rrvResourse){
        RRV rrv =new RRV(
                (long)rrvResourse.getRRV_id(),
                rrvResourse.getCharacter_RRV(),
                rrvResourse.getStorage_start_date(),
                rrvResourse.getNotes_RRV(),
                storageService.getById(Integer.valueOf(rrvResourse.getStorage_id())),
                categoryService.getById(String.valueOf(rrvResourse.getCategory())),
                nuclide_listService.getByID(Integer.valueOf(rrvResourse.getNuclide_list()))
        );

        this.rrvService.SaveRrv(rrv);
        return "newItemRrv";
    }

    @RequestMapping(value = "/rrvsave", method = RequestMethod.POST)
    public String saveRrv(RRV rrv){
        rrvService.SaveRrv(rrv);
        return "redirect:/rrvs";
    }

    @RequestMapping("/rrv/edit/{id}")
    public String editRrv(@PathVariable("id") Long id, Model model){
        model.addAttribute("rrv", this.rrvService.getById(id));
        return "newItemRrv";
    }

    @RequestMapping("rrv/delete/{id}")
    public String deleteRrv(@PathVariable Long id) {
        rrvService.delete(id);
        return "redirect:/rrvs";
    }

    @RequestMapping("rrv/{id}")
    public String showRrv(@PathVariable Long id, Model model) {
        model.addAttribute("rrv", rrvService.getById(id));
        return "rrvShow";
    }
        @RequestMapping(value = "/OrderbyDataRRV", method = RequestMethod.GET)
        public String RrderbyDataRRV( Model model) {
            model.addAttribute("AllRrvs", this.rrvService.OrderbyDataRRV());
            model.addAttribute("All_Activity_RRVS", this.nuclide_listService.All_Activity_RRVS());
            model.addAttribute("All_Amount_RRVS", this.nuclide_listService.All_Amount_RRVS());
            return "rrv";
        }


        @RequestMapping(value = "/OrderByCategoryRRV", method = RequestMethod.GET)
        public String OrderByCategoryRRV( Model model) {
            model.addAttribute("AllRrvs", this.rrvService.findAllByCategory());
            model.addAttribute("All_Activity_RRVS", this.nuclide_listService.All_Activity_RRVS());
            model.addAttribute("All_Amount_RRVS", this.nuclide_listService.All_Amount_RRVS());
            return "rrv";
        }


    //Nuclide_listController
    @RequestMapping(value = "/nuclide_lists", method = RequestMethod.GET)
    public String listNuclide( Model model) {
        model.addAttribute("AllNuclide", this.nuclide_listService.getAll());
        model.addAttribute("All_Activity_BRVS", this.nuclide_listService.All_Activity_BRVS());
        System.out.println(this.nuclide_listService.All_Activity_BRVS());
        System.out.println(this.nuclide_listService.All_Activity_RRVS());
        return "nuclide_list";
    }

    @RequestMapping(value = "/nuclide_list/new", method = RequestMethod.GET)
    public String newNuclide(Model model){
        model.addAttribute("nuclide_list", new Nuclide_list());
        return "nuclide_listform";
    }

    @RequestMapping(value = "/nuclide_list", method = RequestMethod.POST)
    public String saveNuclide(Nuclide_list nuclide_list){
        nuclide_listService.SaveNuclide_list(nuclide_list);
        return "redirect:/nuclide_lists/";
    }
    @RequestMapping("nuclide_list/delete/{id}")
    public String deleteNuclide(@PathVariable Integer id) {
        nuclide_listService.delete(id);
        return "redirect:/nuclide_lists";
    }
}
