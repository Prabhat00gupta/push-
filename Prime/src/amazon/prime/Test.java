package com.prime;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void testUser1() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		User u = new User();
		u.setUserId(101);
		u.setUserName("prabhat");

		YourWatchlist yw = new YourWatchlist();
		yw.setYwlId(201);
		yw.setYwlName("movies/tvshows");
		yw.setU(u);

		Transaction tx = s.beginTransaction();
		s.save(yw);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser2() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * User u = (User)s.get(User.class,101);
		 * 
		 * AccountAndSettings as = new AccountAndSettings(); as.setAccountId(301);
		 * as.setAccountName("shashank"); as.setU(u);
		 * 
		 * Transaction tx = s.beginTransaction();
		 * 
		 * 
		 * s.save(as);
		 * 
		 * tx.commit();
		 */
		Object o1 = s.get(AccountAndSettings.class, 301);
		AccountAndSettings as = (AccountAndSettings) o1;
		as.setAccountName("AccountAndSettingsInfo");

		Transaction tx = s.beginTransaction();
		s.update(as);
		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser3() {

		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * User u = (User)s.get(User.class,101);
		 * 
		 * WatchAnywhere wa = new WatchAnywhere(); wa.setWatchAnywhereId(401);
		 * wa.setWatchAnywhereName("watchanywhere"); wa.setU(u);
		 */
		Object o = s.get(WatchAnywhere.class, 401);
		WatchAnywhere wa = (WatchAnywhere) o;
		wa.setWatchAnywhereName("watchanywhereinfo");

		Transaction tx = s.beginTransaction();

		// s.save(wa);
		s.update(wa);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser4() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		User u = (User) s.get(User.class, 101);

		Help h = new Help();
		h.setHelpId(501);
		h.setHelpName("FAQ");
		h.setU(u);

		Transaction tx = s.beginTransaction();

		s.save(h);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser5() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		User u = (User) s.get(User.class, 101);

		SignOut so = new SignOut();
		so.setSignOutId(601);
		so.setSignOutName("Signingout");
		so.setU(u);

		Transaction tx = s.beginTransaction();

		s.save(so);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testYourWatchlist() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * YourWatchlist yw = (YourWatchlist)s.get(YourWatchlist.class,201);
		 * 
		 * 
		 * YourWatchlistInfo ywli1 = new YourWatchlistInfo(); ywli1.setYwlInfoId(202);
		 * ywli1.setYwlInfo("Dangal");
		 * 
		 * YourWatchlistInfo ywli2 = new YourWatchlistInfo(); ywli2.setYwlInfoId(203);
		 * ywli2.setYwlInfo("TheFamilyMan");
		 * 
		 * Set st = new HashSet(); st.add(ywli1); st.add(ywli2);
		 * 
		 * yw.setChildren(st);
		 * 
		 * 
		 * 
		 * Transaction tx = s.beginTransaction(); s.save(yw);
		 * 
		 * tx.commit(); s.close(); sf.close();
		 */
		Object o = s.get(YourWatchlist.class, 201);
		YourWatchlist yw = (YourWatchlist) o;

		System.out.println(yw.getYwlId() + " " + yw.getYwlName());

		Set se = yw.getChildren();

		Iterator it = se.iterator();
		while (it.hasNext()) {
			Object o1 = it.next();
			YourWatchlistInfo yi = (YourWatchlistInfo) o1;

			System.out.println(yi.getYwlInfoId() + " " + yi.getYwlInfo());
		}
		s.close();
		sf.close();

	}

	public static void testAccountAndSettings1() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		AccountAndSettings as = (AccountAndSettings) s.get(AccountAndSettings.class, 301);

		YourAccount ya = new YourAccount();
		ya.setYourAccountId(302);
		ya.setYourAccountOption("YourDetails");
		ya.setAas(as);

		Transaction tx = s.beginTransaction();
		s.save(ya);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testAccountAndSettings2() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		AccountAndSettings as = (AccountAndSettings) s.get(AccountAndSettings.class, 301);

		PlayBack pb = new PlayBack();
		pb.setPlayBackId(303);
		pb.setPlayBackOption("AutoPlay");
		pb.setAas(as);

		Transaction tx = s.beginTransaction();
		s.save(pb);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testAccountAndSettings3() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * AccountAndSettings as =
		 * (AccountAndSettings)s.get(AccountAndSettings.class,301);
		 * 
		 * ParentalControls pc = new ParentalControls(); pc.setParentalControlsId(304);
		 * pc.setParentalControlName("shashank"); pc.setAas(as);
		 * 
		 * 
		 * Transaction tx = s.beginTransaction(); s.save(pc);
		 */
		Object o = s.get(AccountAndSettings.class, 301);
		AccountAndSettings as = (AccountAndSettings) o;
		System.out.println(as.getAccountId() + " " + as.getAccountName());

		Object o1 = s.get(ParentalControls.class, 304);
		ParentalControls pc = (ParentalControls) o1;
		System.out.println(pc.getParentalControlsId() + " " + pc.getParentalControlName());

		// tx.commit();
		s.close();
		sf.close();

	}

	public static void testAccountAndSettings4() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		AccountAndSettings as = (AccountAndSettings) s.get(AccountAndSettings.class, 301);

		Subtitles sb = new Subtitles();
		sb.setSubtitleId(305);
		sb.setSubtitleOptions("subtitleoptions");
		sb.setAas(as);

		Transaction tx = s.beginTransaction();
		s.save(sb);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testAccountAndSettings5() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		AccountAndSettings as = (AccountAndSettings) s.get(AccountAndSettings.class, 301);

		YourDevices yd = new YourDevices();
		yd.setYourDeviceId(306);
		yd.setYourDeviceName("YourDevices");
		yd.setAas(as);

		Transaction tx = s.beginTransaction();
		s.save(yd);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testAccountAndSettings6() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		AccountAndSettings as = (AccountAndSettings) s.get(AccountAndSettings.class, 301);

		Language l = new Language();
		l.setLanguageId(307);
		l.setLanguageOptions("WEBSITELANGUAGES");
		l.setAas(as);

		Transaction tx = s.beginTransaction();
		s.save(l);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testAccountAndSettings7() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		AccountAndSettings as = (AccountAndSettings) s.get(AccountAndSettings.class, 301);

		WatchHistory wh1 = new WatchHistory();
		wh1.setWatchHistoryId(308);
		wh1.setWatchHistoryName("SherlockHomes");

		WatchHistory wh2 = new WatchHistory();
		wh2.setWatchHistoryId(309);
		wh2.setWatchHistoryName("Sultan");

		WatchHistory wh3 = new WatchHistory();
		wh3.setWatchHistoryId(310);
		wh3.setWatchHistoryName("Mirzapur");

		Set st3 = new HashSet();
		st3.add(wh1);
		st3.add(wh2);
		st3.add(wh3);

		as.setChildren(st3);

		Transaction tx = s.beginTransaction();
		s.save(as);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testWatchAnywhere() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * WatchAnywhere wa = (WatchAnywhere)s.get(WatchAnywhere.class,401);
		 * 
		 * WatchAnywhereInfo wai1 = new WatchAnywhereInfo();
		 * wai1.setWatchAnywhereInfoId(402);
		 * wai1.setWatchAnywhereOptions("Fire TV Stick");
		 * 
		 * WatchAnywhereInfo wai2 = new WatchAnywhereInfo();
		 * wai2.setWatchAnywhereInfoId(403); wai2.setWatchAnywhereOptions("Smart TV");
		 * 
		 * WatchAnywhereInfo wai3 = new WatchAnywhereInfo();
		 * wai3.setWatchAnywhereInfoId(404);
		 * wai3.setWatchAnywhereOptions("Streaming Media Player");
		 * 
		 * WatchAnywhereInfo wai4 = new WatchAnywhereInfo();
		 * wai4.setWatchAnywhereInfoId(405);
		 * wai4.setWatchAnywhereOptions("Game Console");
		 * 
		 * WatchAnywhereInfo wai5 = new WatchAnywhereInfo();
		 * wai5.setWatchAnywhereInfoId(406);
		 * wai5.setWatchAnywhereOptions("ios phone or tablet");
		 * 
		 * WatchAnywhereInfo wai6 = new WatchAnywhereInfo();
		 * wai6.setWatchAnywhereInfoId(407);
		 * wai6.setWatchAnywhereOptions("Android phone");
		 * 
		 * Set st2 = new HashSet();
		 * 
		 * st2.add(wai1); st2.add(wai2); st2.add(wai3); st2.add(wai4); st2.add(wai5);
		 * st2.add(wai6);
		 * 
		 * wa.setChildren(st2);
		 * 
		 * Transaction tx = s.beginTransaction(); s.save(wa);
		 */
		Object o = s.get(WatchAnywhere.class, 401);
		WatchAnywhere wa = (WatchAnywhere) o;
		System.out.println(wa.getWatchAnywhereId() + " " + wa.getWatchAnywhereName());

		Set se = wa.getChildren();

		Iterator it = se.iterator();
		while (it.hasNext()) {
			Object o1 = it.next();
			WatchAnywhereInfo wai = (WatchAnywhereInfo) o1;
			System.out.println(wai.getWatchAnywhereInfoId() + " " + wai.getWatchAnywhereOptions());
		}

		// tx.commit();
		s.close();
		sf.close();

	}

	public static void testHelp() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Help h = (Help) s.get(Help.class, 501);

		HelpInfo hi1 = new HelpInfo();
		hi1.setHelpId(502);
		hi1.setHelpOptions("Setting Up Prime Video");

		HelpInfo hi2 = new HelpInfo();
		hi2.setHelpId(503);
		hi2.setHelpOptions("Accessibility");

		HelpInfo hi3 = new HelpInfo();
		hi3.setHelpId(504);
		hi3.setHelpOptions("Troubleshooting");

		HelpInfo hi4 = new HelpInfo();
		hi4.setHelpId(505);
		hi4.setHelpOptions("Contact Us");

		Set st5 = new HashSet();
		st5.add(hi1);
		st5.add(hi2);
		st5.add(hi3);
		st5.add(hi4);

		h.setChildren(st5);

		Transaction tx = s.beginTransaction();

		s.save(h);

		tx.commit();
		s.close();
		sf.close();
	}

	public static void testYourAccount() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		YourAccount ya = (YourAccount) s.get(YourAccount.class, 302);

		YourAccountDetails yad1 = new YourAccountDetails();
		yad1.setYourAccountDetailsId(3003);
		yad1.setYourAccountDetailsOptions("YourDetails");

		YourAccountDetails yad2 = new YourAccountDetails();
		yad2.setYourAccountDetailsId(3004);
		yad2.setYourAccountDetailsOptions("Prime");

		YourAccountDetails yad3 = new YourAccountDetails();
		yad3.setYourAccountDetailsId(3005);
		yad3.setYourAccountDetailsOptions("Your Payment History");

		Set st6 = new HashSet();
		st6.add(yad1);
		st6.add(yad2);
		st6.add(yad3);

		ya.setChildren(st6);

		Transaction tx = s.beginTransaction();

		s.save(ya);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testPlayBack() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		PlayBack pb = (PlayBack) s.get(PlayBack.class, 303);

		Autoplay ap = new Autoplay();
		ap.setAutoplayId(2500);
		ap.setAutoplayOptions("ON/OFF");
		ap.setPb(pb);

		Transaction tx = s.beginTransaction();

		s.save(ap);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testParentalControls() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		/*
		 * ParentalControls pc = (ParentalControls)s.get(ParentalControls.class,304);
		 * 
		 * PrimeVideoPin pv = new PrimeVideoPin(); pv.setPrimeVideoPinId(2600);
		 * pv.setPin(123456); pv.setPc(pc);
		 * 
		 * Transaction tx = s.beginTransaction();
		 * 
		 * s.save(pv);
		 * 
		 * 
		 * tx.commit();
		 */
		Object o = s.get(ParentalControls.class, 304);
		ParentalControls pc = (ParentalControls) o;
		System.out.println(pc.getParentalControlsId() + " " + pc.getParentalControlName());

		Object o1 = s.get(PrimeVideoPin.class, 2600);
		PrimeVideoPin pp = (PrimeVideoPin) o1;
		System.out.println(pp.getPrimeVideoPinId() + " " + pp.getPin());
		s.close();
		sf.close();

	}

	public static void testSubtitles() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Subtitles sb = (Subtitles) s.get(Subtitles.class, 305);

		SubtitlesOptions so = new SubtitlesOptions();
		so.setSubtitlesOptionsId(2700);
		so.setSubtitlesOptionsName("DEFAULT Preset");

		SubtitlesOptions so1 = new SubtitlesOptions();
		so1.setSubtitlesOptionsId(2701);
		so1.setSubtitlesOptionsName("YOUR presets");

		Set st7 = new HashSet();
		st7.add(so);
		st7.add(so1);

		sb.setChildren(st7);

		Transaction tx = s.beginTransaction();

		s.save(sb);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testYourDevice() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		YourDevices yd1 = (YourDevices) s.get(YourDevices.class, 306);

		YourDevicesInfo ydi = new YourDevicesInfo();
		ydi.setYourDevicesInfoId(2800);
		ydi.setYourDevicesOptions("Register Another Device");

		YourDevicesInfo ydi1 = new YourDevicesInfo();
		ydi1.setYourDevicesInfoId(2801);
		ydi1.setYourDevicesOptions("Your Registered Devices");

		Set st8 = new HashSet();
		st8.add(ydi);
		st8.add(ydi1);

		yd1.setChildren(st8);

		Transaction tx = s.beginTransaction();

		s.save(yd1);

		tx.commit();
		s.close();
		sf.close();
	}

	public static void testLanguage() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Language l1 = (Language) s.get(Language.class, 307);

		WebsiteLanguage wl = new WebsiteLanguage();
		wl.setWebsiteLanguageId(2900);
		wl.setLanguages("ENGLISH");

		WebsiteLanguage wl1 = new WebsiteLanguage();
		wl1.setWebsiteLanguageId(2901);
		wl1.setLanguages("HINDI");

		WebsiteLanguage wl2 = new WebsiteLanguage();
		wl2.setWebsiteLanguageId(2902);
		wl2.setLanguages("Italiano");

		WebsiteLanguage wl3 = new WebsiteLanguage();
		wl3.setWebsiteLanguageId(2903);
		wl3.setLanguages("Suomi");

		Set st9 = new HashSet();

		st9.add(wl);
		st9.add(wl1);
		st9.add(wl2);
		st9.add(wl3);

		l1.setChildren(st9);

		Transaction tx = s.beginTransaction();

		s.save(l1);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser6() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		User u = (User) s.get(User.class, 101);

		Home ho = new Home();
		ho.setHomeId(1000);
		ho.setHomeOptions("Options");
		ho.setU(u);
		Transaction tx = s.beginTransaction();

		s.save(ho);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser7() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		User u = (User) s.get(User.class, 101);

		Movies m = new Movies();
		m.setMoviesId(2000);
		m.setMoviescategory("categories");
		m.setU(u);

		Transaction tx = s.beginTransaction();

		s.save(m);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser8() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		User u = (User) s.get(User.class, 101);

		TVShows tv = new TVShows();
		tv.setTVShowsId(5000);
		tv.setTVShowsInfo("Info");
		tv.setU(u);

		Transaction tx = s.beginTransaction();

		s.save(tv);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testUser9() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		User u = (User) s.get(User.class, 101);

		Kids k = new Kids();
		k.setKidsId(6000);
		k.setKidsCategory("Category");
		k.setU(u);

		Transaction tx = s.beginTransaction();

		s.save(k);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testHome1() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Home ho = (Home) s.get(Home.class, 1000);

		AmazonOriginalSeries aos = new AmazonOriginalSeries();
		aos.setAmazonOriginalSeriesId(1001);
		aos.setName("info");
		aos.setH(ho);

		Transaction tx = s.beginTransaction();

		s.save(aos);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testHome2() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Home ho = (Home) s.get(Home.class, 1000);

		WatchNextTvAndMovies wn = new WatchNextTvAndMovies();
		wn.setWatchNextId(1002);
		wn.setName("moviesnames");
		wn.setH(ho);

		Transaction tx = s.beginTransaction();

		s.save(wn);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testHome3() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Home ho = (Home) s.get(Home.class, 1000);

		RecommendedMovies rm = new RecommendedMovies();
		rm.setRecommendedId(1003);
		rm.setRecommendedName("info");
		rm.setH(ho);
		Transaction tx = s.beginTransaction();

		s.save(rm);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testAmazonOriginalSeries() {

		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		/*
		 * AmazonOriginalSeries aos =
		 * (AmazonOriginalSeries)s.get(AmazonOriginalSeries.class,1001);
		 * 
		 * AmazonOriginalSeriesInfo ai = new AmazonOriginalSeriesInfo();
		 * ai.setInfoId(11); ai.setDetails("THEFAMILYMAN");
		 * 
		 * AmazonOriginalSeriesInfo ai1 = new AmazonOriginalSeriesInfo();
		 * ai1.setInfoId(12); ai1.setDetails("BREATHE");
		 * 
		 * AmazonOriginalSeriesInfo ai2 = new AmazonOriginalSeriesInfo();
		 * ai2.setInfoId(13); ai2.setDetails("MIRZAPUR");
		 * 
		 * Set se = new HashSet(); se.add(ai); se.add(ai1); se.add(ai2);
		 * 
		 * aos.setChildren(se);
		 * 
		 * 
		 * Transaction tx = s.beginTransaction();
		 * 
		 * s.save(aos);
		 * 
		 * tx.commit();
		 */
		Object o = s.get(AmazonOriginalSeries.class, 1001);
		AmazonOriginalSeries as = (AmazonOriginalSeries) o;
		System.out.println(as.getAmazonOriginalSeriesId() + " " + as.getName());

		Set se = as.getChildren();

		Iterator it = se.iterator();
		while (it.hasNext()) {
			Object o1 = it.next();
			AmazonOriginalSeriesInfo ai = (AmazonOriginalSeriesInfo) o1;
			System.out.println(ai.getInfoId() + " " + ai.getDetails());
		}

		s.close();
		sf.close();

	}

	public static void testWatchNextTvAndMovies() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		WatchNextTvAndMovies wt = (WatchNextTvAndMovies) s.get(WatchNextTvAndMovies.class, 1002);

		WatchNextTvAndMoviesInfo wi = new WatchNextTvAndMoviesInfo();
		wi.setWatchnexttvId(21);
		wi.setDetails("DIL CHAHTA HAI");

		WatchNextTvAndMoviesInfo wi1 = new WatchNextTvAndMoviesInfo();
		wi1.setWatchnexttvId(22);
		wi1.setDetails("Batla House");

		WatchNextTvAndMoviesInfo wi2 = new WatchNextTvAndMoviesInfo();
		wi2.setWatchnexttvId(23);
		wi2.setDetails("Arjun Reddy");

		Set se1 = new HashSet();
		se1.add(wi);
		se1.add(wi1);
		se1.add(wi2);

		wt.setChildren(se1);

		Transaction tx = s.beginTransaction();

		s.save(wt);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testRecommendedMovies() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		RecommendedMovies rm = (RecommendedMovies) s.get(RecommendedMovies.class, 1003);

		RecommendedMoviesInfo rmi = new RecommendedMoviesInfo();
		rmi.setRecommendedMoviesInfoId(41);
		rmi.setDetails("PADMAVAT");

		RecommendedMoviesInfo rmi1 = new RecommendedMoviesInfo();
		rmi1.setRecommendedMoviesInfoId(42);
		rmi1.setDetails("RAAZI");

		RecommendedMoviesInfo rmi2 = new RecommendedMoviesInfo();
		rmi2.setRecommendedMoviesInfoId(43);
		rmi2.setDetails("NEWTON");

		Set se2 = new HashSet();
		se2.add(rmi);
		se2.add(rmi1);
		se2.add(rmi2);

		rm.setChildren(se2);

		Transaction tx = s.beginTransaction();

		s.save(rm);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testTvShows1() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		TVShows t = (TVShows) s.get(TVShows.class, 5000);

		ThrowBackTv tb = new ThrowBackTv();
		tb.setThrowbacktvId(5001);
		tb.setInfo("details");
		tb.setT(t);

		Transaction tx = s.beginTransaction();

		s.save(tb);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testTvShows3() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		TVShows t = (TVShows) s.get(TVShows.class, 5000);

		DramaTv dt = new DramaTv();
		dt.setDramaTvId(5003);
		dt.setInfo("details");
		dt.setT(t);

		Transaction tx = s.beginTransaction();

		s.save(dt);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testThrowBackTv() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		ThrowBackTv tb = (ThrowBackTv) s.get(ThrowBackTv.class, 5001);

		ThrowBackTvInfo ti = new ThrowBackTvInfo();
		ti.setThrowbacktvInfoId(24);
		ti.setTvDetails("SHAKTIMAAN");

		ThrowBackTvInfo ti1 = new ThrowBackTvInfo();
		ti1.setThrowbacktvInfoId(25);
		ti1.setTvDetails("MALGUDI DAYS");

		ThrowBackTvInfo ti2 = new ThrowBackTvInfo();
		ti2.setThrowbacktvInfoId(26);
		ti2.setTvDetails("FAUJI");

		Set se3 = new HashSet();
		se3.add(ti);
		se3.add(ti1);
		se3.add(ti2);

		tb.setChildren(se3);

		Transaction tx = s.beginTransaction();

		s.save(tb);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testThrillerTv() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		/*
		 * ThrillerTv tt = (ThrillerTv)s.get(ThrillerTv.class,5002);
		 * 
		 * ThrillerTvInfo tti = new ThrillerTvInfo(); tti.setThrillerTvInfoId(27);
		 * tti.setTvDetails("THE PURGE");
		 * 
		 * ThrillerTvInfo tti1 = new ThrillerTvInfo(); tti1.setThrillerTvInfoId(28);
		 * tti1.setTvDetails("THE TERROR");
		 * 
		 * ThrillerTvInfo tti2 = new ThrillerTvInfo(); tti2.setThrillerTvInfoId(29);
		 * tti2.setTvDetails("Mr. ROBOT");
		 * 
		 * Set se4 = new HashSet();
		 * 
		 * se4.add(tti); se4.add(tti1); se4.add(tti2);
		 * 
		 * tt.setChildren(se4);
		 */
		Object o = s.get(ThrillerTvInfo.class, 29);
		ThrillerTvInfo ti = (ThrillerTvInfo) o;
		ti.setTvDetails("Dr. House");

		Transaction tx = s.beginTransaction();

		// s.save(tt);
		s.update(ti);
		tx.commit();
		s.close();
		sf.close();

	}

	public static void testDramaTv() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		DramaTv dt = (DramaTv) s.get(DramaTv.class, 5003);

		DramaTvInfo di = new DramaTvInfo();
		di.setDramatvInfoId(34);
		di.setTvdetails("Taken");

		DramaTvInfo di1 = new DramaTvInfo();
		di1.setDramatvInfoId(35);
		di1.setTvdetails("Suits");

		DramaTvInfo di2 = new DramaTvInfo();
		di2.setDramatvInfoId(36);
		di2.setTvdetails("The Mentalist");

		Set se5 = new HashSet();
		se5.add(di);
		se5.add(di1);
		se5.add(di2);

		dt.setChildren(se5);

		Transaction tx = s.beginTransaction();

		s.save(dt);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testMovies1() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Movies m = (Movies) s.get(Movies.class, 2000);

		HollywoodMovies hm = new HollywoodMovies();
		hm.setHollywoodmoviesId(2001);
		hm.setName("hollywood movies");
		hm.setM(m);

		Transaction tx = s.beginTransaction();

		s.save(hm);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testMovies2() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Movies m = (Movies) s.get(Movies.class, 2000);

		TeluguMovies tm = new TeluguMovies();
		tm.setTelugumoviesId(2002);
		tm.setName("telugu movies");
		tm.setM(m);
		Transaction tx = s.beginTransaction();

		s.save(tm);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testMovies3() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Movies m = (Movies) s.get(Movies.class, 2000);

		MoviesInHindi mh = new MoviesInHindi();
		mh.setMoviesinhindiId(2003);
		mh.setName("movies in hindi");
		mh.setM(m);
		Transaction tx = s.beginTransaction();

		s.save(mh);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testHollywoodMovies() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		HollywoodMovies hm = (HollywoodMovies) s.get(HollywoodMovies.class, 2001);

		HollywoodMoviesInfo hi = new HollywoodMoviesInfo();
		hi.setHollywoodmoviesInfoId(37);
		hi.setDetails("RAMPAGE");

		HollywoodMoviesInfo hi1 = new HollywoodMoviesInfo();
		hi1.setHollywoodmoviesInfoId(38);
		hi1.setDetails("SPIDER MAN");

		HollywoodMoviesInfo hi2 = new HollywoodMoviesInfo();
		hi2.setHollywoodmoviesInfoId(39);
		hi2.setDetails("VENOM");

		Set s1 = new HashSet();
		s1.add(hi);
		s1.add(hi1);
		s1.add(hi2);

		hm.setChildren(s1);

		Transaction tx = s.beginTransaction();

		s.save(hm);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testTeluguMovies() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		TeluguMovies tm = (TeluguMovies) s.get(TeluguMovies.class, 2002);

		TeluguMoviesInfo ti = new TeluguMoviesInfo();
		ti.setTelugumoviesId(44);
		ti.setDetails("KGF");

		TeluguMoviesInfo ti1 = new TeluguMoviesInfo();
		ti1.setTelugumoviesId(45);
		ti1.setDetails("VIP2");

		TeluguMoviesInfo ti2 = new TeluguMoviesInfo();
		ti2.setTelugumoviesId(46);
		ti2.setDetails("NOTA");

		Set s2 = new HashSet();
		s2.add(ti);
		s2.add(ti1);
		s2.add(ti2);

		tm.setChildren(s2);

		Transaction tx = s.beginTransaction();

		s.save(tm);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testMoviesInHindi() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * MoviesInHindi mh = (MoviesInHindi)s.get(MoviesInHindi.class, 2003);
		 * 
		 * MoviesInHindiInfo mi = new MoviesInHindiInfo(); mi.setMoviesinhindiId(47);
		 * mi.setDetails("GULLYBOY");
		 * 
		 * MoviesInHindiInfo mi1 = new MoviesInHindiInfo(); mi1.setMoviesinhindiId(48);
		 * mi1.setDetails("BHARAT");
		 * 
		 * MoviesInHindiInfo mi2 = new MoviesInHindiInfo(); mi2.setMoviesinhindiId(49);
		 * mi2.setDetails("GANGS OF WASSEPUR");
		 * 
		 * Set s3 = new HashSet(); s3.add(mi); s3.add(mi1); s3.add(mi2);
		 * 
		 * mh.setChildren(s3);
		 */
		Object o = s.get(MoviesInHindiInfo.class, 49);
		MoviesInHindiInfo mi = (MoviesInHindiInfo) o;
		mi.setDetails("KESARI");

		Transaction tx = s.beginTransaction();

		// s.save(mh);
		s.update(mi);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testKids1() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Kids k = (Kids) s.get(Kids.class, 6000);

		IndianToons it = new IndianToons();
		it.setIndiantoonsId(6001);
		it.setName("indian toons");
		it.setK(k);

		Transaction tx = s.beginTransaction();

		s.save(it);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testKids2() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Kids k = (Kids) s.get(Kids.class, 6000);

		ComedyMovies cm = new ComedyMovies();
		cm.setComedymoviesId(6002);
		cm.setName("comedy movies");
		cm.setK(k);
		Transaction tx = s.beginTransaction();

		s.save(cm);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void testKids3() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * Kids k = (Kids)s.get(Kids.class,6000);
		 * 
		 * ComedyTv ct = new ComedyTv(); ct.setComedytvId(6003);
		 * ct.setName("comedy tv"); ct.setK(k);
		 * 
		 * Transaction tx = s.beginTransaction();
		 * 
		 * s.save(ct);
		 * 
		 * tx.commit();
		 */
		Object o = s.get(Kids.class, 6000);
		Kids k = (Kids) o;
		System.out.println(k.getKidsId() + " " + k.getKidsCategory());

		Object o1 = s.get(ComedyTv.class, 6003);
		ComedyTv ct = (ComedyTv) o1;
		System.out.println(ct.getComedytvId() + " " + ct.getName());

		s.close();
		sf.close();

	}

	public static void testIndianToons() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * IndianToons it = (IndianToons)s.get(IndianToons.class,6001);
		 * 
		 * IndianToonsInfo itf = new IndianToonsInfo(); itf.setIndianToonsInfoId(61);
		 * itf.setDetails("SIVA");
		 * 
		 * IndianToonsInfo itf1 = new IndianToonsInfo(); itf1.setIndianToonsInfoId(62);
		 * itf1.setDetails("SUPER JASOOS");
		 * 
		 * IndianToonsInfo itf2 = new IndianToonsInfo(); itf2.setIndianToonsInfoId(63);
		 * itf2.setDetails("KID KRRISH");
		 * 
		 * Set s4 = new HashSet(); s4.add(itf); s4.add(itf1); s4.add(itf2);
		 * 
		 * it.setChildren(s4);
		 */
		Object o = s.get(IndianToonsInfo.class, 61);
		IndianToonsInfo ii = (IndianToonsInfo) o;

		Transaction tx = s.beginTransaction();

		// s.save(it);
		s.delete(ii);
		tx.commit();
		s.close();
		sf.close();

	}

	public static void testComedyMovies() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * ComedyMovies cm = (ComedyMovies)s.get(ComedyMovies.class,6002);
		 * 
		 * ComedyMoviesInfo ci = new ComedyMoviesInfo(); ci.setComedyMoviesInfoId(64);
		 * ci.setDetails("THE SMURFS");
		 * 
		 * ComedyMoviesInfo ci1 = new ComedyMoviesInfo(); ci1.setComedyMoviesInfoId(65);
		 * ci1.setDetails("YOGI BEAR");
		 * 
		 * ComedyMoviesInfo ci2 = new ComedyMoviesInfo(); ci2.setComedyMoviesInfoId(66);
		 * ci2.setDetails("STUART LITTLE");
		 * 
		 * Set s6 = new HashSet(); s6.add(ci); s6.add(ci1); s6.add(ci2);
		 * 
		 * cm.setChildren(s6);
		 * 
		 * Transaction tx = s.beginTransaction();
		 * 
		 * s.save(cm);
		 * 
		 * tx.commit();
		 */
		Object o = s.get(ComedyMovies.class, 6002);
		ComedyMovies cm = (ComedyMovies) o;
		System.out.println(cm.getComedymoviesId() + " " + cm.getName());

		Set se = cm.getChildren();
		Iterator it = se.iterator();
		while (it.hasNext()) {
			Object o1 = it.next();
			ComedyMoviesInfo ci = (ComedyMoviesInfo) o1;
			System.out.println(ci.getComedyMoviesInfoId() + " " + ci.getDetails());
		}

		s.close();
		sf.close();

	}

	public static void testComedyTv() {
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		/*
		 * ComedyTv ct = (ComedyTv)s.get(ComedyTv.class,6003);
		 * 
		 * ComedyTvInfo cti = new ComedyTvInfo(); cti.setComedyTvInfoId(67);
		 * cti.setDetails("CAT AND KEET");
		 * 
		 * ComedyTvInfo cti1 = new ComedyTvInfo(); cti1.setComedyTvInfoId(68);
		 * cti1.setDetails("ARCHIES");
		 * 
		 * ComedyTvInfo cti2 = new ComedyTvInfo(); cti2.setComedyTvInfoId(69);
		 * cti2.setDetails("JOHNNY TEST");
		 * 
		 * Set s7 = new HashSet(); s7.add(cti); s7.add(cti1); s7.add(cti2);
		 * 
		 * ct.setChildren(s7);
		 */
		Object o = s.get(ComedyTvInfo.class, 69);
		ComedyTvInfo ci = (ComedyTvInfo) o;
		ci.setDetails("CHAPLIN");

		Transaction tx = s.beginTransaction();

		// s.save(ct);
		s.update(ci);

		tx.commit();
		s.close();
		sf.close();

	}

	public static void main(String[] args) {

		// testUser1();
		// testUser2();

		// testUser3();
		// testUser4();
		// testUser5();
		// testUser6();
		// testUser7();
		// testUser8();
		// testUser9();

		// testYourWatchlist();

		// testAccountAndSettings1();
		// testAccountAndSettings2();
		// testAccountAndSettings3();
		// testAccountAndSettings4();
		// testAccountAndSettings5();
		// testAccountAndSettings6();
		// testAccountAndSettings7();

		// testWatchAnywhere();

		// testHelp();

		// testYourAccount();
		// testPlayBack();
		testParentalControls();
		// testSubtitles();
		// testYourDevice();
		// testLanguage();

		// testHome1();
		testHome2();
		// testHome3();

		// testAmazonOriginalSeries();
		// testWatchNextTvAndMovies();
		// testRecommendedMovies();

		// testTvShows1();
		// testTvShows2();
		// testTvShows3();

		// testThrowBackTv();
		// testThrillerTv();
		// testDramaTv();

		// testMovies1();
		// testMovies2();
		// testMovies3();

		// testHollywoodMovies();
		// testTeluguMovies();
		// testMoviesInHindi();

		// testKids1();
		// testKids2();
		// testKids3();

		// testIndianToons();
		// testComedyMovies();
		// testComedyTv();

	}

}
