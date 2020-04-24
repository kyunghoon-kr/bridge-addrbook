package bridgweb.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import gbridge.addrbook.AddrBook;
import gbridge.addrbook.AddrBookDAO;
import gbridge.addrbook.AddrBookH2DAO;

@Path("/addrbook")
public class RestApiService {
	AddrBookDAO dao = new AddrBookH2DAO();
	Logger logger = Logger.getLogger("Rest Api Service");
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello() {
		return "Welcome to Addrbook Webservice";
	}
	
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AddrBook> getList() {
		logger.info("API call : /list");
		return dao.getDBList();
	}
	
	@POST
	@Path("new")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String newEntry(AddrBook addrbook) {
		logger.info("API call : /new");
		dao.insertDB(addrbook);
		return "Inserted!";
	}
	
	@GET
	@Path("id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public AddrBook getEntry(@PathParam("id") Integer id) {
		logger.info("API call : /id");
		return dao.getDB(id);
	}
	
	// 과제로 추가한 코드
	
	@POST
	@Path("update")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateEntry(AddrBook addrbook) {
		logger.info("API call : /update");
		dao.updateDB(addrbook);
		return "updated !!";
	}
	
	@DELETE
	@Path("delete/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteEntry(@PathParam("id") Integer id) {
		logger.info("API call : /delete");
		dao.deleteDB(id);
		return "deleted !!";
	}
	
}
