import com.liferay.headless.delivery.client.dto.v1_0.WikiPage;
import com.liferay.headless.delivery.client.pagination.Page;
import com.liferay.headless.delivery.client.resource.v1_0.WikiPageResource;

public class WikiPages_GET_FromParent {

	/**
	 * java -classpath .:* -DparentWikiPageId=1234 WikiPages_GET_FromParent
	 */
	public static void main(String[] args) throws Exception {
		WikiPageResource.Builder builder = WikiPageResource.builder();

		WikiPageResource wikiPageResource = builder.authentication(
			"test@liferay.com", "test"
		).build();

		Page<WikiPage> page = wikiPageResource.getWikiPageWikiPagesPage(
			Long.valueOf(System.getProperty("parentWikiPageId")));

		System.out.println(page);
	}

}