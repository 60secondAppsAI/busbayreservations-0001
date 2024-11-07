import Vue from "vue";
import VueRouter from "vue-router";
import DefaultLayout from "@/layouts/DefaultLayout.vue";
import Buss from  '@/pages/Buss.vue';
import BusDetail from  '@/pages/BusDetail.vue';
import Drivers from  '@/pages/Drivers.vue';
import DriverDetail from  '@/pages/DriverDetail.vue';
import Routes from  '@/pages/Routes.vue';
import RouteDetail from  '@/pages/RouteDetail.vue';
import Quotes from  '@/pages/Quotes.vue';
import QuoteDetail from  '@/pages/QuoteDetail.vue';
import Reservations from  '@/pages/Reservations.vue';
import ReservationDetail from  '@/pages/ReservationDetail.vue';
import Assignments from  '@/pages/Assignments.vue';
import AssignmentDetail from  '@/pages/AssignmentDetail.vue';
import DriverAssignments from  '@/pages/DriverAssignments.vue';
import DriverAssignmentDetail from  '@/pages/DriverAssignmentDetail.vue';
import BusAssignments from  '@/pages/BusAssignments.vue';
import BusAssignmentDetail from  '@/pages/BusAssignmentDetail.vue';
import Payments from  '@/pages/Payments.vue';
import PaymentDetail from  '@/pages/PaymentDetail.vue';
import Amenitys from  '@/pages/Amenitys.vue';
import AmenityDetail from  '@/pages/AmenityDetail.vue';
import Comments from  '@/pages/Comments.vue';
import CommentDetail from  '@/pages/CommentDetail.vue';
import RequestedBys from  '@/pages/RequestedBys.vue';
import RequestedByDetail from  '@/pages/RequestedByDetail.vue';
import AssignedTos from  '@/pages/AssignedTos.vue';
import AssignedToDetail from  '@/pages/AssignedToDetail.vue';
import ApprovedBys from  '@/pages/ApprovedBys.vue';
import ApprovedByDetail from  '@/pages/ApprovedByDetail.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("../views/HomeView.vue"),
			redirect: '/buss',
														  },
  {
    path: "/pricing",
    name: "PricingView",
    component: () => import("../views/PricingView.vue"),
  },
  {
    path: "/arts-gallery",
    name: "ArtsGalleryView",
    component: () => import("../views/ArtsGalleryView.vue"),
  },
  {
    path: "/checkout/:id",
    name: "CheckoutView",
    component: () => import("../views/CheckoutView.vue"),
  },
  {
    path: "/stripe-checkout",
    name: "StripeCheckoutView",
    component: () => import("../views/StripeCheckoutView.vue"),
  },
	{
		path: '/buss',
		name: 'Buss',
		layout: DefaultLayout,
		component: Buss,
	},
	{
	    path: '/bus/:busId', 
	    name: 'BusDetail',
		layout: DefaultLayout,
	    component: BusDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/drivers',
		name: 'Drivers',
		layout: DefaultLayout,
		component: Drivers,
	},
	{
	    path: '/driver/:driverId', 
	    name: 'DriverDetail',
		layout: DefaultLayout,
	    component: DriverDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/routes',
		name: 'Routes',
		layout: DefaultLayout,
		component: Routes,
	},
	{
	    path: '/route/:routeId', 
	    name: 'RouteDetail',
		layout: DefaultLayout,
	    component: RouteDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/quotes',
		name: 'Quotes',
		layout: DefaultLayout,
		component: Quotes,
	},
	{
	    path: '/quote/:quoteId', 
	    name: 'QuoteDetail',
		layout: DefaultLayout,
	    component: QuoteDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/reservations',
		name: 'Reservations',
		layout: DefaultLayout,
		component: Reservations,
	},
	{
	    path: '/reservation/:reservationId', 
	    name: 'ReservationDetail',
		layout: DefaultLayout,
	    component: ReservationDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/assignments',
		name: 'Assignments',
		layout: DefaultLayout,
		component: Assignments,
	},
	{
	    path: '/assignment/:assignmentId', 
	    name: 'AssignmentDetail',
		layout: DefaultLayout,
	    component: AssignmentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/driverAssignments',
		name: 'DriverAssignments',
		layout: DefaultLayout,
		component: DriverAssignments,
	},
	{
	    path: '/driverAssignment/:driverAssignmentId', 
	    name: 'DriverAssignmentDetail',
		layout: DefaultLayout,
	    component: DriverAssignmentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/busAssignments',
		name: 'BusAssignments',
		layout: DefaultLayout,
		component: BusAssignments,
	},
	{
	    path: '/busAssignment/:busAssignmentId', 
	    name: 'BusAssignmentDetail',
		layout: DefaultLayout,
	    component: BusAssignmentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/payments',
		name: 'Payments',
		layout: DefaultLayout,
		component: Payments,
	},
	{
	    path: '/payment/:paymentId', 
	    name: 'PaymentDetail',
		layout: DefaultLayout,
	    component: PaymentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/amenitys',
		name: 'Amenitys',
		layout: DefaultLayout,
		component: Amenitys,
	},
	{
	    path: '/amenity/:amenityId', 
	    name: 'AmenityDetail',
		layout: DefaultLayout,
	    component: AmenityDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/comments',
		name: 'Comments',
		layout: DefaultLayout,
		component: Comments,
	},
	{
	    path: '/comment/:commentId', 
	    name: 'CommentDetail',
		layout: DefaultLayout,
	    component: CommentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/requestedBys',
		name: 'RequestedBys',
		layout: DefaultLayout,
		component: RequestedBys,
	},
	{
	    path: '/requestedBy/:requestedById', 
	    name: 'RequestedByDetail',
		layout: DefaultLayout,
	    component: RequestedByDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/assignedTos',
		name: 'AssignedTos',
		layout: DefaultLayout,
		component: AssignedTos,
	},
	{
	    path: '/assignedTo/:assignedToId', 
	    name: 'AssignedToDetail',
		layout: DefaultLayout,
	    component: AssignedToDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/approvedBys',
		name: 'ApprovedBys',
		layout: DefaultLayout,
		component: ApprovedBys,
	},
	{
	    path: '/approvedBy/:approvedById', 
	    name: 'ApprovedByDetail',
		layout: DefaultLayout,
	    component: ApprovedByDetail,
	    props: true // Pass route params as props to the component
  	},
];

const router = new VueRouter({
  mode: "hash",
  base: process.env.BASE_URL,
  routes,
});

export default router;
