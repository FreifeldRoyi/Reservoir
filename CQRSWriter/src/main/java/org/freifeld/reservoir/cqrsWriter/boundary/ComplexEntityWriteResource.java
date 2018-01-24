package org.freifeld.reservoir.cqrsWriter.boundary;

import org.freifeld.reservoir.cqrsWriter.entity.ComplexEntity;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author royif
 * @since 12/01/18.
 */
@Path("complexEntities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ComplexEntityWriteResource
{
	@POST
	public void writeComplexEntity(ComplexEntity complexEntity)
	{
		System.out.println("YOOHOO " + complexEntity);
	}
}
