package snippet;

public class Snippet {
	<ivysettings>
	   <settings defaultResolver="ivyrepolocal" />
	   <resolvers>
	    <filesystem name="ivyrepolocal">
	        <artifact pattern="${user.home}/ivyrepolocal/[module]/[artifact]-[revision].[ext]" />
	        <ivy pattern="${user.home}/ivyrepolocal/[module]/ivy-[revision].xml" />
	    </filesystem>
	   </resolvers>
	</ivysettings>
}

