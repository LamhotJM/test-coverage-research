package prep60.chap4.hashmap;

import java.util.HashSet;
import java.util.Set;

public class Q14_929UniqueEmailAddresses {

	/*
	 * 929. Unique Email Addresses
	 * 
	 * Every valid email consists of a local name and a domain name, separated by
	 * the '@' sign. Besides lowercase letters, the email may contain one or more
	 * '.' or '+'.
	 * 
	 * For example, in "alice@leetcode.com", "alice" is the local name, and
	 * "leetcode.com" is the domain name. If you add periods '.' between some
	 * characters in the local name part of an email address, mail sent there will
	 * be forwarded to the same address without dots in the local name. Note that
	 * this rule does not apply to domain names.
	 * 
	 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the
	 * same email address. If you add a plus '+' in the local name, everything after
	 * the first plus sign will be ignored. This allows certain emails to be
	 * filtered. Note that this rule does not apply to domain names.
	 * 
	 * For example, "m.y+name@email.com" will be forwarded to "my@email.com". It is
	 * possible to use both of these rules at the same time.
	 * 
	 * Given an array of strings emails where we send one email to each email[i],
	 * return the number of different addresses that actually receive mails.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: emails =
	 * ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
	 * "testemail+david@lee.tcode.com"] Output: 2 Explanation:
	 * "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive
	 * mails. Example 2:
	 * 
	 * Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"] Output:
	 * 3
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= emails.length <= 100 1 <= emails[i].length <= 100 email[i] consist of
	 * lowercase English letters, '+', '.' and '@'. Each emails[i] contains exactly
	 * one '@' character. All local and domain names are non-empty. Local names do
	 * not start with a '+' character.
	 * 
	 * 
	 */

	public static void main(String args[]) {
		Q14_929UniqueEmailAddresses ob = new Q14_929UniqueEmailAddresses();
		String emails[] = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		System.out.println(ob.numUniqueEmails(emails));

		String emails2[] = { "test.email+alex@leetcode.com", "test.email@leetcode.com" };
		System.out.println(ob.numUniqueEmails(emails2));
	}

	public int numUniqueEmails(String[] emails) {
		Set<String> emailsSet = new HashSet<>();

		for (String e : emails) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < e.length(); i++) {
				if (e.charAt(i) == '+') {
					int idx = e.length() - 1;
					while (e.charAt(idx) != '@') {

						idx--;
					}
					sb.append(e.substring(idx));
					break;
				} else {
					sb.append(e.charAt(i));
				}
			}
			emailsSet.add(sb.toString());
		}

		System.out.println(emailsSet);

		return emailsSet.size();
	}

	public int numUniqueEmails2(String[] emails) {
		Set<String> uniqueEmailAddress = new HashSet<>();
		for (String email : emails) {

			// [user, domain]
			String[] split = email.split("@");
			String user = split[0].split("\\+")[0].replaceAll("\\.", "");

			uniqueEmailAddress.add(user + "@" + split[1]);
		}
		System.out.println(uniqueEmailAddress.toString());

		return uniqueEmailAddress.size();
	}

}
